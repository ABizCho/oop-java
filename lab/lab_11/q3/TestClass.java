class Out
{
	class Inner
	{
		public void M1()
		{
			System.out.println("inner class method is running");
		}
	}
}
class TestClass {
	
	public static void main(String[] args) 
	{
		Out out = new Out();
		Out.Inner inner = out.new Inner();
		inner.M1();
	}

}

