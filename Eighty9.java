package test;

public class Eighty9 {
	void m(){System.out.println("hello m");}  
	void n(){  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}   
	 
	public static void main(String args[]){  
		Eighty9 a=new Eighty9();  
	a.n();  

}
}
	
