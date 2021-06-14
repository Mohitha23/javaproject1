package test;

public class Eighty3 {
	int num;
    String name;
  
    // this would be invoked while an object
    // of that class is created.
    Eighty3()
    {
        System.out.println("Constructor called");
    }

	
    public static void main (String[] args)
    {
            	Eighty3 geek1 = new Eighty3();
  
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }

}
