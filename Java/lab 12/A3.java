// Write a program to create a custom exception named AgeException, get the age of 
// the user from command prompt (terminal) and if age is less than 18 it should throw 
// AgeException, also handle this exception in main method.

import java.util.Scanner;
class Age extends Exception {
    public Age(String message) {
        super(message);
    }
}
public class A3 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            if (!st.hasNextInt()) {
                throw new Age("Invalid input: age must be a number.");
            }

            int age = st.nextInt();

            if (age < 18) {
                throw new Age("Access denied: age " + age + " is less than 18.");
            }

            System.out.println("Age " + age + " is accepted. You may proceed.");
            } 
        catch (Age e) {
            System.out.println("AgeException caught: " + e.getMessage());
        }
        finally {
            st.close();
        }
    }
}
