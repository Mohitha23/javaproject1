package test;

public class Eighty6 {
	 String name;
	   int age;
	   
	   Eighty6(String name, int age){
	      this.name = name;
	      this.age = age;
	      System.out.println("This is the constructor of the demo class");
	   }
	   public static void main(String args[]){
	    
	      
	      String name = "Mohitha";
	      System.out.println("Enter the value of age: ");
	      
	      int age =6;
	      Eighty6 obj = new  Eighty6(name, age);
	      
	      System.out.println("Value of the instance variable name: "+name);
	      System.out.println("Value of the instance variable age: "+age);
	   }

}
