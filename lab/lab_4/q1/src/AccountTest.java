package lab.lab_4.q1.src;

// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial balance of each obejct
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
        account1.deposit(depositAmount); //add to accountl's balance

        // display balances
        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); //obtaint user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);

        account2.deposit(depositAmount); // add to account2 balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
        

        // My answer Lines

            // create accounts from user Inputs
        System.out.print("Enter the name of the third Account object:");
        String accountName = input.next();
        System.out.print("Enter the initial balance of the third Account object: ");
        double initialBalace = input.nextDouble();
        Account account3 = new Account(accountName, initialBalace);


        System.out.print("Enter the name of the fourth Account object: ");
        accountName = input.next();
        System.out.print("Enter the initial balance of the fourth Account object: ");
        initialBalace = input.nextDouble();
        Account account4 = new Account(accountName, initialBalace);
        
        System.out.printf("%n%n%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
        System.out.printf("%s balance: $%.2f%n", account3.getName(), account3.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account4.getName(), account4.getBalance());
        
            // transfer
        System.out.print("[Transfer] Enter the Amount of money you want to send to account4: ");
        double transferAmount = input.nextDouble();
        
        System.out.printf("%n-------Before Balance of Accounts-------%n");
        System.out.printf("%s balance: $%.2f%n", account3.getName(), account3.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account4.getName(), account4.getBalance());
        
        boolean resTrans = account3.transfer(account4, transferAmount);

        if ( resTrans == true ){
            System.out.printf("The transfer has successfully executed.%n");

            System.out.printf("-------After Balance of Accounts-------%n");
            System.out.printf("%s balance: $%.2f%n", account3.getName(), account3.getBalance());
            System.out.printf("%s balance: $%.2f%n%n", account4.getName(), account4.getBalance());
        }
        else
            System.out.printf("The transfer has failed.%n");

        input.close();
    }

}
