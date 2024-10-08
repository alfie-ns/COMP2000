public class q9 {

    // Define the class that increments value until it reaches MAX
    public static class Incrementer {
        private int value;  // Starting value
        private final int MAX;  // Maximum value

        // Constructor to initialize the starting value and MAX value
        public Incrementer(int value, int max) {
            this.value = value;
            this.MAX = max;
        }

        // Method to increment the value until it reaches MAX
        public void incrementUntilMax() {
            while (value < MAX) {
                value++;
                System.out.println("Current Value: " + value);
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Incrementer class with a starting value of 0 and MAX of 10
        Incrementer inc = new Incrementer(0, 10);

        // Increment the value until it reaches MAX
        inc.incrementUntilMax();
    }
}