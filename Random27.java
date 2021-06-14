package myproject2;



public class Random27 {
	 private String name;
	   private String email;
	   private String phoneNumber;

	   
	   public static int personCounter = 0;

	  
	   public static void printPersonCounter() {
	        System.out.println("Person counter: " + personCounter);
	   }

	   
	   public Random27 (String initName, String initEmail, String initPhone)
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
	       
		   Random27  p1 = new Random27 ("Sana", "sana@gmail.com", "123-456-7890");
		   Random27  p2 = new Random27 ("Jean", "jean@gmail.com", "404 899-9955");

		   Random27 .printPersonCounter();
	   }

}
