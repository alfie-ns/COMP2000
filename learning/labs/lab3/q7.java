// Define the Stopwatch class
class Stopwatch {
    
    // Method to simulate a stopwatch
    public void stopwatch() {
        // Record the start time
        long startTime = System.nanoTime();

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate and print the elapsed time
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }
}

public class q7 {
    public static void main(String[] args) {
        // Create an instance of the Stopwatch class
        Stopwatch sw = new Stopwatch();

        // Call the stopwatch method
        sw.stopwatch();
    }
}