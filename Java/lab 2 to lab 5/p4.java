import java.util.Scanner;
public  class p4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Fahrenhit:");
        double f =sc.nextDouble();
        System.out.println("Answer:" +((f-32)*5/9.0));
    }
}