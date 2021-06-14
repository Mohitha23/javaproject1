package test;

public class Eighty4 {
	String s;
	 
    public Eighty4(){
    	System.out.println("Super");
    }
}
 
public class Sub extends Eighty4 {
 
    public Sub(){
    	System.out.println("Sub");
    }
 
    public static void main(String[] args){
    	Sub s = new Sub();
    }

}
