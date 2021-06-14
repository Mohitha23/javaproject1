package test;

public class One19 {
	public static void main(String args[]) {
        try 
        {
            Class.forName("GeeksForGeeks");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

}
