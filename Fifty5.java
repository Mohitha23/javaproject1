package test;

public class Fifty5 {
	public void add(int a,int b)
	{
		System.out.println("sum is"+(a+b));
	}
	public void add(float x,float y)
	{
		System.out.println("sum is "+(x+y));
	}
	public static void main(String args[])
	{
		Fifty5 f=new Fifty5();
		f.add(10,20);
		f.add(2.6f,7.89f);
		
	}

}
