public class Outer {
	
	private int x=10;
	private static int y=20;
	
	public void M1() 
    {
		int z=30;
		
		class Inner
        {
			public void M2() 
            {
				System.out.println("sum: " + (x+y+z));
			}
		}
		
		Inner inner = new Inner();
		inner.M2(); // 1
		inner.M2(); // 2
		inner.M2(); // 3
	} // end of M1
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.M1();
	}

}
