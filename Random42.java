package myproject2;



	interface My
	{
		int x=30;
		void show();
	}
	public class Random42  implements My
	{
		public void show()
		{
			System.out.println("hello world");
			System.out.println("x="+x);

			
		}
	    public static void main(String args[])
		{
			My m=new Random42();
			m.show();
			System.out.println("x is"+m.x);
			
		}

	}
