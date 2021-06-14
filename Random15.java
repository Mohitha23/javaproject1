package myproject2;

public class Random15 {
	public static void main(String[] args) {
		   String s1="Welcome to Coding World";
		   String s2="WELCOME TO CODING WORLD"  ;
		   String s3="run",s4="run",s5="fun",s6="sun";
		   System.out.println("EqualsIgnoreCase result : "+s1.equalsIgnoreCase(s2));
		   System.out.println("Starts with results : "+s1.startsWith("Welcome")+" "+s1.startsWith("to",8));
		   System.out.println("Ends with result : "+s1.endsWith("Coding")+" "+s1.endsWith("Coding World"));
	        System.out.println("CompareTo results : "+s3.compareTo(s4)+" "+s3.compareTo(s5)+" "+s3.compareTo(s6));
		}


}
