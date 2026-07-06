import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        System.out.println("Length of string: " + length);

        int mid = length / 2;
        String secondHalf = str.substring(mid);

        System.out.println("Second half of the string: " + secondHalf);
    }
}
