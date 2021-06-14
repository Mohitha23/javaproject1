package test;

import java.io.IOException;

public class One13 {
	void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
		}  
		 class Testthrows2{  
		   public static void main(String args[]){  
		    try{  
		    	One13 m=new One13();  
		     m.method();  
		    }catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("normal flow...");  
		  }  

}
