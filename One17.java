package test;

public class One17 {
	 public static void main(String args[])
	  {
	    int a =10, b = 0, c;
	    System.out.println("Hello 1");
	    try
	    {
	      c = a/b;
	      System.out.println(c);  
	    }
	    catch(ArithmeticException e)
	    {
	      System.out.println("Do not divide by zero sir."  + e );
	    }
	    System.out.println("Hello 2");
	    System.out.println("Hello 3");
	  }

}
