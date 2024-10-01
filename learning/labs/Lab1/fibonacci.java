package Lab1;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci series of first " + n + " numbers is:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    
}
