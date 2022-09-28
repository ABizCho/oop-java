package lab.lab_4.q2.src;

public class Account 
{
	private String name;
	private double balance;
	static private int initialAccountNumber = 100;
	private int accountNumber;
	
	public Account(String name, double balance)
	{
		this.name = name;
		if(balance > 0.0)
		{
			this.balance = balance;
		}
		accountNumber = getInitialAccountNumber();
		
	}
	
	private int getInitialAccountNumber() //Automatically Creates an Account number for the one which gonna be created
	{
		return ++initialAccountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	
	public double getBalance()
	{
		return balance;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String getName()
	{
		return name;
	}
}
