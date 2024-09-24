#!/bin/bash

# Enhanced Git Commit Importance Script
# The script allows selective Git staging, customized importance levels with 
# a message, and local backup of the Categories/ and prompts/ directories.

# https://claude.ai/chat/3420f343-5909-49ab-93cc-ba5360bb51e0

set -e  # Exit immediately if a command exits with a non-zero status

# Function to print bold text
print_bold() {
    echo -e "\033[1m$1\033[0m"
}

# Function to get commit importance and custom message
get_commit_details() {
    local importance_text
    while true; do
        echo -n "Enter the importance (1-5): " >&2
        read -rsn1 importance
        echo >&2

        case $importance in
            1) importance_text="Trivial"; break;;
            2) importance_text="Minor"; break;;
            3) importance_text="Moderate"; break;;
            4) importance_text="Significant"; break;;
            5) importance_text="Milestone"; break;;
            *) echo "Invalid input. Please try again." >&2;;
        esac
    done

    echo -n "Enter a custom message for the commit: " >&2
    read custom_message
    echo >&2

    echo "${importance_text}: ${custom_message}"
}

# Function to selectively add files to staging
selective_add() {
    print_bold "\nUnstaged changes:"
    git status --porcelain | grep -E '^\s*[\?M]' | sed 's/^...//'
    # the above command lists all untracked and modified files;
    # untracked(?) and modified(M); the final sed command removes
    # the first three characters which are the status flags.
    while true; do
        echo -n "Enter file/directory to add, 'all' (or 'done' to finish): "
        read item

        if [ "$item" = "done" ]; then
            break
        elif [ "$item" = "all" ]; then
            git add .
            echo "Added all changes"
            break
        elif [ -e "$item" ]; then
            git add "$item"
            echo "Added: $item"
        else
            echo "File/directory not found. Please try again."
        fi
    done
}

# Main Execution
# 1. Exclude Categories/ from Git tracking; ignore messages for each file
git rm -r --cached Categories/ 2>/dev/null || true # or true ensures contonuation even if the command fails

# 2. Selectively add changes to staging area
selective_add

# 3. Get commit importance and custom message
print_bold "\nCommit importance:" >&2
echo "1. Trivial" >&2
echo "2. Minor" >&2
echo "3. Moderate" >&2
echo "4. Significant" >&2
echo -e "5. Milestone\n" >&2
commit_message=$(get_commit_details)

# 4. Backup/Sync the Categories/ and prompts/ directories in parallel and ignore error messages
if rsync -avh --update --delete "Categories/" "../../base/Categories/" > /dev/null 2>&1 & \
   rsync -avh --update --delete "prompts/" "../../base/desktop-prompts/" > /dev/null 2>&1 & \
   wait; then
    print_bold "\nBackup completed; Categories/ and prompts/ directories synchronised and backed up.\n" >&2
    
    # 5. Commit and push changes
    if git commit -m "$commit_message"; then
        echo "Changes committed successfully" >&2
        if git push origin main; then
            echo -e '\nLocal repo pushed to remote origin\n' >&2
            print_bold "Commit message: $commit_message" >&2
            exit 0
        else
            echo "Error: Failed to push to remote. Check your network connection and try again." >&2
            exit 1
        fi
    else
        echo "Error: Failed to commit changes. Check Git configuration." >&2
        exit 1
    fi
else
    echo -e "\nFailed to back up Categories/ directory and prompts/; push aborted" >&2
    exit 1
fi