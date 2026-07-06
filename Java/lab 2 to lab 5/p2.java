import java.util.Scanner;

public  class p2{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Select Operator:");
            System.out.println("1.Addition(+)");
            System.out.println("2.Subtraction(-)");
            System.out.println("3.Multiplication(*)");
            System.out.println("4.Division(/)");
            System.out.println("5.Reminder(%)");

            String s=sc.nextLine();
            System.out.println("Enter the number a :");

            double a=sc.nextDouble();
            System.out.println("Enter the number b :");
            double b=sc.nextDouble();

            if(s.equals("+")){
             System.out.println("addition is = "+(a+b));
            }
            else if(s.equals("-")){
             System.out.println("subtraction is = "+(a-b));
            }
            else if(s.equals("*")){
             System.out.println("multiplication is = "+(a*b));
            }
            else if(s.equals("/")){
                if(a<b)
                {
                    System.out.println("ERROR");
                }
                else
                {
                     System.out.println("division is = "+(a/b));
                }
             
            }
            else if(s.equals("%")){
             System.out.println("division is = "+(a%b));
            }
            else{
                System.out.println("invalied input");
            }
    }
 }