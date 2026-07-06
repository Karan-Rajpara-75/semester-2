import java.util.Scanner;
public  class p3{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a length:");
            double a = sc.nextDouble();
            System.out.println("Enter a Width:");
             double b = sc.nextDouble();
             System.out.println("Answer:" +(a*b));
             if(a==b)
             {
                System.out.println("Your Length and Width Same so, This is Sqare");
             }
             else
             {
                System.out.println("Your Length and Width not Same so, This is Rectangle");
             }
    }
}