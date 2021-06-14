package test;

public class Seventy7 {
	
	   private String name;
	   private String email;
	   private String phoneNumber;

	   
	   public static int personCounter = 0;

	  
	   public static void printPersonCounter() {
	        System.out.println("Person counter: " + personCounter);
	   }

	   
	   public Seventy7(String initName, String initEmail, String initPhone)
	   {
	      name = initName;
	      email = initEmail;
	      phoneNumber = initPhone;
	      personCounter++;
	   }
	   public String toString()
	   {
	     return  name + ": " + email + " " + phoneNumber;
	   }

	   
	   public static void main(String[] args)
	   {
	       
		   Seventy7 p1 = new Seventy7("Sana", "sana@gmail.com", "123-456-7890");
		   Seventy7 p2 = new Seventy7("Jean", "jean@gmail.com", "404 899-9955");

		   Seventy7.printPersonCounter();
	   }

	}
