import java.util.Scanner;
public  class p5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        double a =sc.nextDouble();
        System.out.println("Enter b :");
        double b =sc.nextDouble();
        System.out.println("Enter c :");
        double c =sc.nextDouble();
        if(a<b && c<b)
        {
           System.out.println("Largest Number is:" +b);
        }
        else if(b<c && a<c)
        {
            System.out.println("Largest Number is:" +c);
        }
        else
        {
            System.out.println("Largest Number is:" +a);
        }
    }
}