package myproject2;

public class Random32 {public static void irt(int[] array,int pos,int val)
{
int nw[]=new int[array.length+1];
for (int i=0;i<array.length+1;i++)
   {
   if(i==pos)
       nw[i]=val;
   else if(i<pos)
       nw[i]=array[i];
   else
       nw[i]=array[i-1];
	}
	System.out.println("After Inserting :");
	for(int k:nw)
       System.out.print(k+" ");
}
public static void main(String args[])
{
	int a[]={1,2,3,4,5};
	int p=3,v=90;
	irt(a,p,v);
}


}
