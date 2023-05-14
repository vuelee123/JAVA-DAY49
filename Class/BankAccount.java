package Class;

public class BankAccount {
    private String accountName;
    private Double balance;
    private Integer accountNum;


    public BankAccount(String accountName, Double balance, Integer accountNum) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNum = accountNum;
    }

    public double deposit(double amount) {
        balance += amount;
        return amount;
    }

    public double withdrawal(double amount) {
        return this.balance - amount;
    }

    public void accountInfo() {
        this.balance = balance;
        System.out.println("My account balance: $" + balance);
        System.out.println(this.accountName + "'s account balance is " + this.balance);
    }

    public String getAccountName() {
        return accountName;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }
    public BankAccount get(int i) {
        return null;
    }
    public void transfer(BankAccount bankAccount, double transferAmount) {
    }
    public int size() {
        return 0;
    }
}



