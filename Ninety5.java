package test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ninety5 {
	public static void main(String[] args)
    {
        File file = new File("doc.txt");
 
        try (FileReader fr = new FileReader(file))
        {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
