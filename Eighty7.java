package test;

public class Eighty7 {
	private String name = null;
    public Eighty7(){
        super("super text 1");
        //this("Unknown"); //UNCOMMENTED DOES NOT COMPILE
        name = "Unknown";
    }
    public Eighty7(String name){
        super("super text 2");
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class SecondChild extends CorTest{
    private String name = null;
    public SecondChild(){
        this("super text 1", "Unknown");
    }
    public SecondChild(String name){
        this("super text 2", name);
    }
    private SecondChild(String superStr, String name)
    {
        super(superStr);
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class CorTest{
    public CorTest(String str){
        System.out.println("ConstructorTest constructor called with parameter \"" + str + "\"");
    }
    public static void main(String... args)
    {
        System.out.println("Hello from main, FirstChild results:");
        Eighty7 fc1 = new Eighty7();
        Eighty7 fc2 = new Eighty7("John");
        System.out.println("           child fc1 name: " + fc1.getName());
        System.out.println("           child fc2 name: " + fc2.getName());
        System.out.println("Hello from main, SecondChild results:");
        SecondChild sc1 = new SecondChild();
        SecondChild sc2 = new SecondChild("John");
        System.out.println("           child sc1 name: " + sc1.getName());
        System.out.println("           child sc2 name: " + sc2.getName());
    }

}
