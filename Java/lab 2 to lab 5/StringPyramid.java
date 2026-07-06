import java.util.Scanner;

public class StringPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        for (int i = 1; i <= text.length(); i++) {
            System.out.println(text.substring(0, i));
        }

        sc.close();
    }
}
