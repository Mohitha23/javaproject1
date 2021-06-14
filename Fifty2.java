package test;

public class Fifty2 {
	public void add(int a,int b)
	{
		System.out.println("sum is"+(a+b));
	}
	public void add(int x,int y,int z)
	{
		System.out.println("sum is "+(x+y+z));
	}
	public static void main(String args[])
	{
		Fifty2 f=new Fifty2();
		f.add(10,20);
		f.add(10,20,30);
		
	}
	

}
