import java.util.Scanner;
class Account {
    private int accNum;
    private String accType;
    private double balance;

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }
    public String getAccType() {
        return accType;
    }
    public double getBalance() {
        return balance;
    }
}

public class A3 {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        Account a1 = new Account();
        a1.setAccNum(1001);
        a1.setAccType("Saving");
        a1.setBalance(25000.50);

        Account a2 = new Account();
        a2.setAccNum(2002);
        a2.setAccType("Current");
        a2.setBalance(4.00);

        Account a3 = new Account();
        a3.setAccNum(3003);
        a3.setAccType("Saving");
        a3.setBalance(150001.75);

        System.out.print("enter Account number:");
        int a = st.nextInt();
        if(a==1001){
            displayAccount(a1);
        }
        else if (a==2002) {
            displayAccount(a2);
        }
        else if (a==3003){
            displayAccount(a3);
        }
        else{
            System.out.println("error 404");
        }
    }
    public static void displayAccount(Account a) {
        System.out.println("Account Number : " + a.getAccNum());
        System.out.println("Account Type   : " + a.getAccType());
        System.out.println("Balance        : " + a.getBalance());
    }
}
