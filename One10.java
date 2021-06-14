package test;

public class One10 {
	 void t1()
	    {
	        System.out.println("super");

	    }

	}
	 class concret extends One10{

	    void t1()
	    {
	        System.out.println("child");

	    }
	    void t2()
	    {
	        System.out.println("child2");

	    }

	}

	class run {
	    public static void main(String[] args) {
	    	One10 t=new concret();

	        t.t1();
	    }

}
