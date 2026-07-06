import java.util.Scanner;

class bankaccount{
   int accountno;
   double bankbalance;
   static String banknane;
   static double interest;

    bankaccount(int accountno, double bankbalance) {
        this.accountno = accountno;
        this.bankbalance = bankbalance;
    }
    static void banknane(String name){
       banknane=name;
    }
    static void interest(double rate){
       interest=rate;
    }

    void display(){
        System.out.println("account no."+accountno);
        System.out.println("bank balance:"+bankbalance);
        System.out.println("bank name  :"+banknane);
        System.out.println("interest rate:"+interest);
    }
}
public class a3{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("bank name :");
      bankaccount.banknane(sc.nextLine());
      System.out.println("interest rate :");
      bankaccount.interest(sc.nextDouble());
      bankaccount b1 = new bankaccount(12345, 1000.0);
        bankaccount b2 = new bankaccount(67890, 2000.0);
        bankaccount b3 = new bankaccount(54321, 3000.0);
        b1.display();
        b2.display();
        b3.display();
  }
}