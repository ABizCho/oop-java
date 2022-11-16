class Outer 
{
	private int x = 10;
	private static int y = 20;
	
	class Inner
	{
		public void M1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		Outer Outer = new Outer();
		Outer.Inner inner = Outer.new Inner();
		inner.M1();
	}

}
