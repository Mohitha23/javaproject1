package test;

public class Ninety {
	{
        System.out.println("init block");
    }
  
    // no-arg constructor
	Ninety() 
    {
        System.out.println("default");
    }
  
    // constructor with one arguemnt.
	Ninety (int x)
    {
        System.out.println(x);
    }
  
    public static void main(String[] args)
    {
        // Object creation by calling no-argument 
        // constructor.
        new Ninety ();
  
        // Object creation by calling parameterized 
        // constructor with one parameter.
        new Ninety (10);
    }

}
