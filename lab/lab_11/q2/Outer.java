package lab.lab_11.q2;

public class Outer 
{
	class Inner
	{
		public void M1()
		{
			System.out.println("inner class method is running");
		}
	}
	public static void main(String[] args)
	{
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.M1();
	}

}
