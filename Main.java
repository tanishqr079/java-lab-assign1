// File: Main.java
public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();
        Fibonacci fibonacci = new Fibonacci();

        int option = userInput.getOption();

        switch (option) {
            case 1:
                int terms = userInput.getNumber("Enter the number of terms for the Fibonacci series:");
                fibonacci.printFibonacci(terms);
                break;

            case 2:
                int num1 = userInput.getNumber("Enter the first number:");
                int num2 = userInput.getNumber("Enter the second number:");

                System.out.println("Choose an operation: 1-Add, 2-Subtract, 3-Multiply, 4-Divide");
                int operation = userInput.getNumber("Enter your choice:");

                try {
                    switch (operation) {
                        case 1:
                            System.out.println("Result: " + calculator.add(num1, num2));
                            break;
                        case 2:
                            System.out.println("Result: " + calculator.subtract(num1, num2));
                            break;
                        case 3:
                            System.out.println("Result: " + calculator.multiply(num1, num2));
                            break;
                        case 4:
                            System.out.println("Result: " + calculator.divide(num1, num2));
                            break;
                        default:
                            System.out.println("Invalid operation choice.");
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid option. Please restart the program.");
        }

        userInput.close();
    }
}
