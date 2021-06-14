package test;

public class Eighty {

	 public static String geekName = "";
	 public void sam()
	 {
		 System.out.println("this is instance method");
	 }
	 
	    public static void geek(String name)
	    {
	        geekName = name;
	        System.out.println(Eighty.geekName);
	        System.out.println(Eighty.geekName);
	    }
	}
	 
	class GFG {
	    public static void main(String[] args)
	    {
	 
	        
	        
	    	Eighty.geek("vaibhav");
	    	Eighty e=new Eighty();
	    	e.sam();
	       
	    }

}
