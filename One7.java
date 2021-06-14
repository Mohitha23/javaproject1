package test;
abstract class Myclass
{
	abstract void cal(double x);
	void show()
	{
		System.out.println("This is abstract class");
	}
}

public class One7 extends Myclass{
	void cal(double x)
	{
		System.out.println("square is"+(x*x));
	}

}
 class Cube extends Myclass
 {
	 void cal(double x)
	 {
		 System.out.println("cube is"+(x*x*x));
	 }
 }
 class Abb
 {
	 public static void main(String args[])
	 {
		 Myclass m;
		 m=new One7();
		 m.cal(10);
		 m=new Cube();
		 m.cal(10);
		 
	 }
 }
