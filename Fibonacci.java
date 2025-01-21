// File: Fibonacci.java
public class Fibonacci {
    public void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
