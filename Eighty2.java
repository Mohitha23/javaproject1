package test;

public class Eighty2 {
	    static int x = 20; // static variable 
	    int y = 30; // instance variable 
	// Declare an instance method. 
	    void display() 
	    { 
	// 
	     System.out.println(x); 
	     System.out.println(y); 
	    } 
	// Declare a static method. 
	    static void show() 
	    { 
	 
	      System.out.println(x); 
	   
	   } 
	public static void main(String[] args) 
	{ 
	
		Eighty2 st = new Eighty2(); 
	
	     st.display(); 

	
	     show(); 
	   } 
}
