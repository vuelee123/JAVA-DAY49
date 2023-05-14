package Class;
import java.util.Scanner;
import java.util.ArrayList;;
public class BankAccountMain {
        public static ArrayList<BankAccount> BankAccount = new ArrayList <>();
        public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //BankAccount account = new BankAccount("Lee Vue", 500);
        //double MyDeposit = account.deposit(100);
       // account.accountInfo();

       // BankAccount Larry = new BankAccount("Larry", 5000);
       // double LarryAccount = Larry.withdrawal(100);

        //BankAccount Mary = new BankAccount("Mary", 300);
        //double MaryAccount = Mary.deposit(100);

      //  System.out.println("Larry's account balance: " + LarryAccount);
       // System.out.println("Marry's account balance: " + MaryAccount);

        BankAccount.add(new BankAccount("Lee", 2000.0, 100));
        BankAccount.add(new BankAccount("Avis", 10.0, 101));
        BankAccount.add(new BankAccount("Kian", 5.0, 102));


        // bank part 2
        System.out.println("Hello world! Welcome to the Bank of Lee!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Integer start = Integer.valueOf(scan.nextLine());

        if (start == 1){
            System.out.println("Please enter Account Number");
            Integer requestAccount = Integer.valueOf(scan.nextLine());
            boolean targetAccount = false;
            int index =-1;

            for(int a =0; a < BankAccount.size(); a ++){
                if (BankAccount.get(a).getAccountNum()== requestAccount){
                    targetAccount = true;
                    index = a;
                }
            }
            if (!targetAccount){
                System.out.println("Account not found");
            } else if ( targetAccount && index >=0){
                mainMenu(BankAccount.get(index));
            }
        } else if (start == 2){
        System.out.println("Let's make a new account!");
        System.out.println("What is the name of the account?");
        String accountName= scan.nextLine();
        System.out.println("What is the beginning balance for the account?");
        Double balance=Double.parseDouble(scan.nextLine());
        Integer accountNum = (int)(Math.random());
        BankAccount.add(new BankAccount(accountName, balance, accountNum));
        mainMenu(BankAccount.get((BankAccount.size()-1)));
    }else{
        System.out.println("Have a good day!");

    }

}
    public static void mainMenu(BankAccount account){
        System.out.println("Hello " + account.getAccountName());
        System.out.println("Welcome to the Main Menu, What would you like to do today?");

        while(true){
            System.out.println("1. To check account balance");
            System.out.println("2. To make a withdrawal");
            System.out.println("3. To make a deposit");
            System.out.println("4. To make a transfer to an another account");
            System.out.println("5. To exit.");
            Scanner scan= new Scanner(System.in);

            Integer response = Integer.valueOf(scan.nextLine());

            if (response == 1){
                System.out.println("Your account balance is: $" + account.getBalance());
            } else if( response == 2){
                System.out.println("Enter amount to withdrawal");
                double withdrawalAmount = scan.nextDouble();
                account.withdrawal(withdrawalAmount);
                System.out.println( account.getBalance());
            }else if ( response == 3){
                System.out.println("Enter amount to deposit");
                double depositAmount = scan.nextDouble();
                account.deposit(depositAmount);
                System.out.println(account.getBalance());
            }else if(response == 4){
                System.out.println("Enter account number");
                int accountRequest = Integer.parseInt(scan.nextLine());
                boolean targetAccount;
                targetAccount = false;
                int index =-1;


                for(int i =0; i < account.size(); i ++){
                    if (account.get(i).getAccountNum()== accountRequest){
                        targetAccount = true;
                        index= i;
                    }
                }
                if (targetAccount && index >= 0){
                    System.out.println("Enter transfer amount");
                    Double transferAmount = Double.parseDouble(scan.nextLine());
                    account.transfer(BankAccount.get(index), transferAmount);
                    System.out.println(" Transfer $" + transferAmount + " from " + BankAccount.get(index));

                }else{
                    System.out.println("Account doesn't exist. Try again.");
                }
            }else if (response == 5){
                System.out.println("Have a nice day!");
                break;
            }

        }
    }
}
