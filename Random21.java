package myproject2;

public class Random21 {
	public static void secmx(int[] array)
	 {
	     int secmax=array[0],max=array[0];
	 for (int i=0;i<array.length;i++)
	    {
	        if(max<array[i])
	{ 	secmax=max;
	            max=array[i];
	}
	       else if(array[i]>secmax)
		secmax=array[i];
		}
		System.out.println("Second max is "+secmax);
	}
	public static void main(String args[])
	{
		int a[]={13,-4,0,19,4,5};
		secmx(a);
	}

}
