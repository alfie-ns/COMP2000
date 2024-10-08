/*  
 * You have a list of colours: red, yellow, green, blue, purple, black, and white.
 * Write a java program to print out the name of any object (animal, fruits,
 * vegetable, plants, etc.) that reminds you of each colour.
 */

 public class q3 {
    public static void main(String[] args) {
        // Define arrays for colours and objects
        String[] colours = {"red", "yellow", "green", "blue", "purple", "black", "white"};
        String[] objects = {
            "Apple",        // red
            "Banana",       // yellow
            "Grass",        // green
            "Ocean",        // blue
            "Lavender",     // purple
            "Panther",      // black
            "Snow"          // white
        };

        // Loop through the arrays and print the object for each colour
        for (int i = 0; i < colours.length; i++) {
            System.out.println("Colour: " + colours[i] + " - Object: " + objects[i]);
        }
    }
}