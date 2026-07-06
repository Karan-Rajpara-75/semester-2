// Write a program in java if number is less than 10 and greater than 50, it generate the exception out of range. Else it displays the square of number.
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = st.nextInt();
        st.close();

        try {
            int result = squareIfInRange(n);
            System.out.println("Square of " + n + " is " + result);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    private static int squareIfInRange(int value) {
        if (value < 10 || value > 50) {
            throw new IllegalArgumentException("Out of range: must be between 10 and 50 inclusive.");
        }
        return value * value;
    }
}