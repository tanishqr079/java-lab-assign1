import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public int getOption() {
        System.out.println("Enter 1 for Fibonacci series or 2 for Simple Calculation:");
        return scanner.nextInt();
    }

    public int getNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public void close() {
        scanner.close();
    }
}