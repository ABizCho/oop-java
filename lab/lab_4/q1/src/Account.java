package lab.lab_4.q1.src;

public class Account {
    //---------Fields Area---------//
    private String name; //instance variable
    private double balance; //instance variable

    //---------constructor Area---------//
    // Account constructor that receives two parameters
    public Account(String name, double balance)
    {
        this.name = name; //assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not, instance variable keeps its default initial value of 0.0
        if (balance > 0.0) //0 이하 입력값 예외처리
            this.balance = balance;
    }

    //---------Methods Area---------//
    
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) //if the depositAmount is valid
            balance = balance + depositAmount;
    }

    // method returns the account balance
    public double getBalance()
    {
        return balance;
    }
    
    // method that sets the name
    public void setName(String name)
    {
        this.name = name;
    }

    // method that returns the name
    public String getName()
    {
        return name; // give value of name back to caller
    }

    // method
    public boolean transfer(Account b, double amount)
    {
        
        if(amount <= this.getBalance() && b!=null && amount > 0.0) // handling exceptions
        {    
            this.balance -= amount;
            b.deposit(amount);
            return true; 
        }
        return false;
    }
}
