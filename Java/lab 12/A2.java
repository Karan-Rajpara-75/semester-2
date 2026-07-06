// Write a program to create Account class, which is representing a bank account where 
// we can deposit and withdraw money. If user need to withdraw money which exceed 
// our minimum bank balance then it will not be allowed, and will throw  
// Insufficient(Custom Exception). Handle above exception and display 
// proper error message.
class Insufficient extends Exception {
    public Insufficient(String msg) {
        super(msg);
    }
}

class Account {
    double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) throws Insufficient {
        if (balance - amount < 500) {
            throw new Insufficient("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }
}

public class A2 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(500);
        try {
            a.withdraw(1200);
        } catch (Insufficient e) {
            System.out.println(e.getMessage());
        }
    }
}