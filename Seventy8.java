package test;

public class Seventy8 {

	private int x; 
    public static void main(String args[]) { 
    	Seventy8 c = new Seventy8(7); //Instance of Program 
        System.out.println(c.getX()); 
    } 
     
    public Seventy8(int x){ 
        this.x = x; 
    } 
     
    public int getX(){ 
        return x; 
    } 
     
    public void setX( ){ 
        this.x = x; 
    } 

}
