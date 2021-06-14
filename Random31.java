package myproject2;

public class Random31 {
	public static void cpy(int[] array)
	 {
	 int cp[]=new int[array.length];
	int c=0;
	 for (int value : array)
	{
	cp[c]=value;
	c++;
	}
		System.out.println("Copy Array:");
	for(int k:cp)
	System.out.print(k+" ");
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		cpy(a);
	}


}
