package myproject2;

public class Random33 {

	public static void mnmx(int[] array)
	 {
	     int min=array[0],max=array[0];
	 for (int i=0;i<array.length;i++)
	    {
	        if(min>array[i])
	            min=array[i];
	        if(max<array[i])
	            max=array[i];
		}
		System.out.println("Min and max are "+min+","+max);
	}
	public static void main(String args[])
	{
		int a[]={13,-4,0,19,4,5};
		mnmx(a);
	}


}
