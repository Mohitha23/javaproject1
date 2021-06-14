package test;

public class seventh {
	void arih(int a,int b)
	{
	    int add= a+b;
        int mul= a *b;
        int sub= a-b;
        int div= a/b;
        
        System.out.println("add = " + add);
        System.out.println("mul= " + mul);
        System.out.println("sub= " + sub);
        System.out.println("div= " + div); 
		
	}
	public static void main(String args[])
	{
		int x=20;
		int y=10;
		seventh s=new seventh();
		s.arih(x,y);
	}

}
