package myproject2;
import java.util.HashSet;
import java.util.Set;


public class Random36 {
	
	

		public static void FindCommonElemet(int[] arr1,int[] arr2)
		{
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]){
						set.add(arr1[i]);
						break;
					}
				}
			}
			for (Integer i : set) {
				System.out.print(i + " ");
			}
		}
		public static void main(String[] args)
		{
			int[] arr1= { 1,2,56,34,6,7,98,5 };
			int[] arr2 = { 2,6,89,76,5,45,2,34 };
			System.out.println("Common Elements:");
			FindCommonElemet(arr1, arr2);
		}

}
