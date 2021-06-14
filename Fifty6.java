package test;

public class Fifty6 {
	public void add(int a,int b)
	{
		System.out.println("sum is"+(a+b));
	}
	public int add(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
	public static void main(String args[])
	{
		Fifty6 f=new Fifty6();
		f.add(10,20);
		f.add(50,40);
		
	}

}
