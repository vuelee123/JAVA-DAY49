package Class;

public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void accountInfo() {
        System.out.println("My account balance: $" + balance);
    }
    public void AddAccount () {
        System.out.println("Larry's account balance: $" + balance);
        System.out.println("Mary's account balance: $" + balance);

    }

}
