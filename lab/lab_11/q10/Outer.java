class Outer 
{
	static class Inner
    {
		public static void main(String[] args) 
        {
			System.out.println("Method of Static inner class is running");
		}
	}
	public static void main(String[] args) 
    {
		System.out.println("method of outer class is running");
	}
}
