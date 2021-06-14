package myproject2;

public class Random22 {
	public static void evod(int[] array)
	 {
	     int e=0,o=0;
	 for (int i=0;i<array.length;i++)
	    {	
	        if(array[i]%2==0)
	            e++;
	        else
	            o++;
		}
		System.out.println("No.of Even and Odd are "+e+","+o);
	}
	public static void main(String args[])
	{
		int a[]={13,8,26,19,4,5};
		evod(a);
	}

}
