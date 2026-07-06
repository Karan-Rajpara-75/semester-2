public class A2 {
    
}
abstract class BankAccount{
    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{

    SavingsAccount(double balance){
        super(balance);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("SavingsAccount Balance: " + balance);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        System.out.println("SavingsAccount Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount{

    CurrentAccount(double balance){
        super(balance);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("CurrentAccount Balance: " + balance);
    }

    void withdraw(double amount){
        balance -= amount;
        System.out.println("CurrentAccount Balance: " + balance);
    }
}

public class BankAccountDemo{

    public static void main(String[] args){

        SavingsAccount s = new SavingsAccount(1000);
        s.deposit(500);
        s.withdraw(200);

        CurrentAccount c = new CurrentAccount(2000);
        c.deposit(1000);
        c.withdraw(500);
    }
}