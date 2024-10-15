package q1;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printTitle();
            book.printAuthor();
            book.printYear();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "1960");
        Book book2 = new Book("1984", "George Orwell", "1949");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "1813");

        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);

        manager.printAllBooks();
    }
}