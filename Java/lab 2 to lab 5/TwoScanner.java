import java.util.Scanner;
public class TwoScanner
{
    public static void main(String[] args)
    {
        Scanner TS = new Scanner(System.in);
        int a = TS.nextInt();
        int b = TS.nextInt();
        System.out.println("sum : " +(a+b));
    }
}