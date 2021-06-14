package test;

import java.util.Arrays;

public class Seventy5 {

	public static class Main{  
		public static int[] removeDuplicateElements(int arr[], int n){  
		        if (n==0 || n==1){  
		            return arr;  
		        }  
		        int[] temp = new int[n];  
		        int j = 0;  
		        for (int i=0; i<n-1; i++){  
		            if (arr[i] != arr[i+1]){  
		                temp[j++] = arr[i];  
		            }  
		         }  
		        temp[j++] = arr[n-1]; 
		        int [] temp1=new int[j];
		        int c=0;
		        for(int i=0;i<j;i++)
		            temp1[i]=temp[i];
		        return temp1;  
		    }  
		       
		    public static void main (String[] args) {  
		        int arr[] = {10,70,30,90,20,20,30,40,70,50};
		        Arrays.sort(arr);
		        int length = arr.length;  
	    		int[] r;
		        r = removeDuplicateElements(arr, length);  
		    
		        for (int i=0; i<r.length; i++)  
		           System.out.print(r[i]+" ");  
		    }  

}
}
