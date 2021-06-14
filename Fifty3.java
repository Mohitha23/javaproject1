package test;

public class Fifty3 {
	public void add(int a,int b)
	{
		System.out.println("sum is"+(a+b));
	}
	public void add(float x,float y,float z)
	{
		System.out.println("sum is "+(x+y+z));
	}
	public static void main(String args[])
	{
		Fifty3 f=new Fifty3();
		f.add(10,20);
		f.add(1.56f,2.89f,3.86f);
		
	}
	

}
