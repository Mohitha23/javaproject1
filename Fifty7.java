
package test;

public class Fifty7 {
	public  Fifty7()
    {
        System.out.println("Programming");
    }
    public Fifty7(int i, int j)
    {
        System.out.println("Programming + +");
    }
}

class DP extends Fifty7 {
   
    public DP()
    {
        super(10, 20);
        System.out.println("DP");
    }
    public DP(int i, int j)
    {
        System.out.println("DP + +");
    }
    public static void main(String[] args)
    {
        Fifty7 obj = new Fifty7();
    }
}

 


