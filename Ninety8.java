package test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ninety8 {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("D:\\testout.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	    System.out.println("Success");  
	    }  

}
