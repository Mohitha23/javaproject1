package test;

import java.util.HashMap;

public class One34 {
	public static void main(String args[])
	{
	HashMap<Integer, String> hm1 = new HashMap<>();
	HashMap<Integer, String> hm2= new HashMap<Integer, String>();
	hm1.put(1, "Anjali");
	hm1.put(2, "Balu");
	hm1.put(3, "Chandrika");
	hm1.put(4, "David");
	hm1.put(5, "Eve");
	        hm1.put(6, "Fathima");
	        hm1.put(7, "Gita");
	        hm1.put(8, "Harsha");
	        hm1.put(9, "Imran");
	        hm1.put(10, "Janaki");
	        System.out.println("Mappings of HashMap hm1 are : "+ hm1);
	        System.out.println("Fetched value is "+hm1.get(5));
	        System.out.println("Cloned hashmap "+ hm1.clone());
	        System.out.println("Checking if key is in the map : "+hm1.containsKey(6));
	        System.out.println("Checking if value is in the map : "+hm1.containsValue("Harsha"));
	        System.out.println("Checking if map is empty : "+hm1.isEmpty());	
	        System.out.println("Size of the map : "+hm1.size());
	        System.out.println("All keys that are present in the map are : "+hm1.keySet());
	        hm1.remove(6);
	        System.out.println("Checking if 6 is in the map : "+hm1.containsKey(6));
	        hm2.putAll(hm1);
	        System.out.println("New map : "+hm2);
	              }



}
