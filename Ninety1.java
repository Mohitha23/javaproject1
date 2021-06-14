package test;

public class Ninety1 {
	void eat(){System.out.println("eating...");}  
}  
class Pog extends Ninety1{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}
}
class Rock{
public static void main(String args[]){  
Pog d=new Pog();  
d.work();  


}
}
