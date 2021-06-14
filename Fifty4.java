package test;

public class Fifty4 {
	public void add(int a,int b)
	{
		System.out.println("sum is"+(a+b));
	}
	public void add(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
	public static void main(String args[])
	{
		Fifty4 f=new Fifty4();
		f.add(10,20);
		f.add(50,40);
		
	}

}
