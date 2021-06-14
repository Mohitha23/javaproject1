package test;

import java.util.UUID;

public class One04 {
	private static  One04 single = null;
    private String ID = null;
  
    private  One04()
    {
        /* Make it private, in order to prevent the 
           creation of new instances of the Singleton
           class. */
  
        // Create a random ID
        ID = UUID.randomUUID().toString();
    }
  
    public static  One04 getInstance()
    {
        if (single == null)
            single = new  One04();
        return single;
    }
  
    public String getID()
    {
        return this.ID;
    }

    public static void main(String[] args)
    {
    	 One04 s =  One04.getInstance();
        System.out.println(s.getID());
    }

}

