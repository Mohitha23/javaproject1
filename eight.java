package test;

public class eight {
	void fun(int number)
	{
	System.out.println("Number is " + number);
    number++;
    System.out.println("Now, number is " + number);
    number--;
    System.out.println("Now, number is " + number);
	}
	public static void main(String args[])
	{
		int num=50;
		eight e=new eight();
		e.fun(num);
	}

}
