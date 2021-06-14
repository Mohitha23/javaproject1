package test;

public class Seventy9 {
	int a=10;

	static int count=0;//will get memory only once and retain its value  
	  
	Seventy9(){  
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	System.out.println(a);
	}  
	  
	public static void main(String args[]){  
	//creating objects  
		Seventy9 c1=new Seventy9();  
		Seventy9 c2=new Seventy9();  
		Seventy9 c3=new Seventy9();  
	}  
}
