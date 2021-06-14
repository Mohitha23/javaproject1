package test;

public class One33 {
	 void m1()
	    {
	        System.out.println("Inside A's m1 method");
	    }
	}
	  
	class Draw extends One33
	{
	    // overriding m1()
	    void m1()
	    {
	        System.out.println("Inside B's m1 method");
	    }
	}
	  
	class C extends One33
	{
	    // overriding m1()
	    void m1()
	    {
	        System.out.println("Inside C's m1 method");
	    }
	}
	  
	// Driver class
	class Dispatch
	{
	    public static void main(String args[])
	    {
	        // object of type A
	    	One33 a = new One33();
	  
	        // object of type B
	       Draw b = new Draw();
	  
	        // object of type C
	        C c = new C();
	  
	        // obtain a reference of type A
	        A ref;
	          
	        // ref refers to an A object
	        ref = (A) a;
	  
	        // calling A's version of m1()
	        ref.m1();
	  
	        // now ref refers to a B object
	        ref = (A) b;
	  
	        // calling B's version of m1()
	        ref.m1();
	  
	        // now ref refers to a C object
	        ref = (A) c;
	  
	        // calling C's version of m1()
	        ref.m1();
	    }

}
