package myproject2;




	interface Add
	{
		int k=4;
		int r=5;
		void add();
	}
	interface Mul extends Add
	{
		void mul();
	}

	public class Random45  implements  Mul 
	{
				
	 public void add()
	 {
	  System.out.println("add of 2 nums is"+(k+r));
	  }
	  public void mul()
	  {
		 System.out.println("mul of 2 nums is"+k*r);
	  }
	  public static void main(String args[])
	  {
		  Random45 t = new Random45();
			t.add();
			t.mul();
					
	  }

}
