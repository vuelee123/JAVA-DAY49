package Class;

public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public double deposit(double amount) {
        balance += amount;
        return amount;
    }

    public double withdrawal(double amount) {
       return this.balance - amount;
    }

    public void accountInfo() {
        System.out.println("My account balance: $" + balance);
        System.out.println(this.accountName + "'s account balance is " + this.balance);
    }

}
