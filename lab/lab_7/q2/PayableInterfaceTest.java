package lab.lab_7.q2;

public class PayableInterfaceTest 
{
	public static void main(String[] args) 
	{
		
		Payable[] payableObjects = new Payable[10];
		
		
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] =
				new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] =
				new SalariedEmployee("Lisa", "Barnes", "222-22-2222", 1200.00);
		payableObjects[4] = 
				new HourlyEmployee("Cho", "Seongwoo", "333-33-3333", 0.2, 8);
		payableObjects[5] = 
				new HourlyEmployee("Lee", "Wooyeop", "444-44-4444", 0.3, 7);
		payableObjects[6] = 
				new CommissionEmployee("Kim", "Minji", "555-55-5555", 1000000, 0.3);
		payableObjects[7] = 
				new CommissionEmployee("Park", "Jihwan", "666-66-6666", 100000, 0.2);
		payableObjects[8] = 
				new BasePlusCommissionEmployee("Hwang", "Myunjin", "777-77-7777", 30000, 0.2, 800.00);
		payableObjects[9] = 
				new BasePlusCommissionEmployee("Jung", "Soi", "888-88-8888", 35000, 0.2, 700.00);
		
		
		System.out.println(
				"polymorphical Invoices and Employees------------------");
		
		
		for(Payable currentPayable : payableObjects)
		{
			
			System.out.printf("%n%s %n%s: $%,.2f%n",
					currentPayable.toString(),
					"payment due", currentPayable.getPaymentAmount());
		}
	}
}
