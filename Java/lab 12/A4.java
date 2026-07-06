// Write a Java program that divides two numbers.  If Num1 or Num2 were not an integer, 
// the program would throw a Number Format Exception. If Num2 were Zero, the program 
// would throw an Arithmetic Exception. Display appropriate message for each exception. 
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Num1 (integer): ");
            String input1 = scanner.nextLine().trim();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter Num2 (integer): ");
            String input2 = scanner.nextLine().trim();
            int num2 = Integer.parseInt(input2);

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integer values for Num1 and Num2.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
