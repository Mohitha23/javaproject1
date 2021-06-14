package test;

public abstract class One9 {
	abstract void draw();  
	}  
		class Rectangle extends One9 {  
	void draw(){System.out.println("drawing rectangle");}  
	}  
	class Circle1 extends One9 {  
	void draw(){System.out.println("drawing circle");}  
	}  
	 
	class TestAbstraction1{  
	public static void main(String args[]){  
		One9  s=new Circle1();
	s.draw();  
	}  

}
