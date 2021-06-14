package myproject2;

public class Random24 {
	public static void difmnmx(int[] array)
	 {
	     int min=array[0],max=array[0];
	 for (int i=0;i<array.length;i++)
	    {
	        if(min>array[i])
	            min=array[i];
	        if(max<array[i])
	            max=array[i];
		}
		System.out.println("Difference of Min and max is "+Math.abs(min-max));
	}
	public static void main(String args[])
	{
		int a[]={13,14,0,19,4,5};
		difmnmx(a);
	}



}
