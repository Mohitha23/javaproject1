package myproject2;



public class Random30 {
	public static void find(int[] array, int s)
	 {
	 int sum = 0,c=0,f=-1;
	 for (int value : array)
	{
	 	 if(value==s)
	{	f=c;
		break;
	}
	c++;
		}
	if(f==-1)
	System.out.println("Array does not contains the element");
	else
	 System.out.println("Array contains the element");
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
	int s1=4,s2=7;
	Random30 s=new Random30();
		s.find(a,s1);
		s.find(a,s2);
	}

}
