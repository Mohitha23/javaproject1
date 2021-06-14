package myproject2;

public class Random28 {
	public static void main(String args[])
	{
	int a[]={1,2,3,6,4};
	int f=-1;
	int s1=4,p=0;
	for(int k:a)
	{
		if(k==s1)
	{
			f=p;
			break;
		}
		p++;
	}
	if(f==-1)
		System.out.println("Element not found");
	else
		System.out.println(f);
	}


}
