package myproject2;


public class Random {
	 void addnum(int[] array)
	 {
	    int sum = 0;
	    for (int value : array)
	 	      sum += value; 
	    System.out.println(sum);
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		Random t=new Random();
		t.addnum(a);
	}


}
