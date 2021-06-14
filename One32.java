package test;

public class One32 {
	private void One32()
    {
        System.out.println("From parent m1()");
    }
  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
  
class Child extends One32 {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }
  
    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }

}
