package myproject2;

public class Random19 {
	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i=new Integer(12345);  
	    String s=String.valueOf(i);  
	    String s1=Integer.toString(i);
	    StringBuilder sb=new StringBuilder();
	    sb.append(i);
	    System.out.println(i+" "+s+" "+s1+" "+sb);
		}


}
