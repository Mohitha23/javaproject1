package test;

public class Eighty5 {
	protected void msg(){System.out.println("Hello java");}  
	}  
	  
	public class Simple extends Eighty5{  
	public void msg(){System.out.println("Hello java");}//C.T.Error  
	 public static void main(String args[]){  
	   Simple obj=new Simple();  
	   obj.msg();  
	   }  

}
