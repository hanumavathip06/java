public class Exceptionhandling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;  // risky value
            int result = a / b;  // will cause ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}
