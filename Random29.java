package myproject2;

public class Random29 {
	public static float avgnum(int[] array)
	 {
	 int sum = 0,c=0;
	 for (int value : array)
	  {
		   c++;
	 	 sum += value; 
	  }
	return sum/c; 
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		float r=avgnum(a);
		System.out.println(r);
	}

}
