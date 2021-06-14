package myproject2;


interface Area
{
	double pie=3.1459;
	void area();
}
interface Perimeter extends Area
{
	void perimeter();
}
public class Random44 implements Perimeter 
	{
		int r=4;
		public void area()
		{
			System.out.println("area of circle is"+pie*r*r);
		}
		public void perimeter()
		{
			System.out.println("perimeter of circle is"+(2*pie*r));
		}
		public static void main(String args[])
		{
			Random44 t = new Random44();
			t.area();
			t.perimeter();
			
	}
	}

