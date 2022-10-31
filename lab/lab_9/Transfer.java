package lab.lab_9;

public class Transfer extends Transaction {
    private int transferAmount;
    private int targetAccount;
    private Keypad keypad;

    private final static int CANCELED = 6;

    public Transfer(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad) 
    {
        super(userAccountNumber, atmScreen, atmBankDatabase);

        keypad = atmKeypad;
	}

	@Override
    public void execute() {
        // TODO Auto-generated method stub
        
        boolean cashTransferred = false;
        double availableBalance;

        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        do
        {
            do {
                targetAccount = getTargetAccountInput();
                if (targetAccount != 98765){
                    screen.displayMessageLine("\nPlease write a valid account!\n");
                }
            }
            while ( targetAccount != 98765 && targetAccount != 12345);

            transferAmount = getTransferAmountInput();

            if (transferAmount != CANCELED)
            {
                availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

                if (transferAmount <= availableBalance){

                    bankDatabase.debit(getAccountNumber(),transferAmount);

                    bankDatabase.credit(targetAccount,transferAmount);

                    cashTransferred = true;
                }

                else
                {
                    screen.displayMessageLine("\nInsufficient funds in your account." + "\n\nPlease write a smaller amount.");
                }
            }
            else {
                screen.displayMessageLine("\nCanceling transaction...");
                return;
            } 
    } while (!cashTransferred);
}

    private int getTargetAccountInput()
    {
       int userInput = 0; // local variable to store return value
 
       Screen screen = getScreen(); // get screen reference
       
 
       // loop while no valid choice has been made
       while (userInput == 0)
       {
          // display the menu
          screen.displayMessageLine("\n Write a valid target account number you want to send:");
 
          int targetAccount = keypad.getInput(); // get user targetAccount through keypad

          if ( targetAccount != CANCELED )
          {
            if (targetAccount <= 0) {
                screen.displayMessageLine("Not a Valid account. Please write a positive number");
            }
            else {
                userInput = targetAccount;
            }
          }
          else {
            screen.displayMessageLine("Break this session [Cancel].");
            break;
          }
        }
       return userInput; // return withdrawal amount or CANCELED
    } // end method displayMenuOfAmounts

    private int getTransferAmountInput()
    {
        int userInput = 0;
        Screen screen = getScreen(); // get screen reference
       

        while (userInput == 0)
        {
           // display the menu
           screen.displayMessageLine("\n Write a valid transfer amount you want to:");
  
           int transferAmount = keypad.getInput(); // get user transferAmount through keypad
 
           if ( transferAmount != CANCELED )
           {
             if (transferAmount <= 0) {
                 screen.displayMessageLine("Not a Valid transfer amount. Please write a positive number");
             }
             else {
                 userInput = transferAmount;
             }
           }
           else {
             screen.displayMessageLine("Break this session [Cancel].");
             break;
           }
         }
        return userInput; // return withdrawal amount or 
    }

    
}
