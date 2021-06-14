package myproject2;


interface Mother
{
	float ht=5.6f;
	void height();
}
interface Father
{
	float ht=6.0f;
	void height();
}
		
public class Random43 implements Mother,Father {
	public void height()
	{
		System.out.println("child height is"+(Mother.ht+Father.ht));
	}
	public static void main(String args[])
	{
		Random43 t=new Random43();
		t.height();
		
	}
}
