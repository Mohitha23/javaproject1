package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class IOUtils {
	 public static void main(String[] args)
	    {
	        File file = new File("doc.txt");
	 
	        try (InputStream in = new FileInputStream(file))
	        {
	            String contents = IOUtils.toString(in, StandardCharsets.UTF_8);
	            System.out.println(contents);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	private static String toString(InputStream in, Charset utf8) {
		// TODO Auto-generated method stub
		return null;
	}

}
