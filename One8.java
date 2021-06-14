package test;

public abstract class One8 {
	 public abstract void sound();
	}
	
	 class Lion extends  One8{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		   One8 obj = new Lion();
		obj.sound();
	   }

}
