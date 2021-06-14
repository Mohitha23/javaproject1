package test;

public class Eighty1 {

	public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	     //Student.b++;
	     //s1.showData();
	  }
	}

	class Student {
	public static final char[] name = null;
	int a; //initialized to zero
	public char[] id;
	static int b; //initialized to zero only when class is loaded not for each object created.

	  Student(){
	   //Constructor incrementing static variable b
	   b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
}
