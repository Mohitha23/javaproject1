package test;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class One35 {
	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<String>();
		HashSet<String> nh = new HashSet<String>();
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India");
		h.add("Australia");
		h.add("Canada");
		System.out.println(h);
		System.out.println("List contains India or not:"+ h.contains("India"));
		h.remove("Australia");
		System.out.println("List after removing Australia:"+ h);
		System.out.println("Iterating over list:");
		Iterator i =(Iterator) h.iterator();
		java.util.Iterator<String> i1;
		while (i1.hasNext())
		 System.out.println(i1.next());
		System.out.println("Size is "+h.size());
		System.out.println("Cloned hashset : "+h.clone());
		nh=h;
		System.out.println("New hash set : "+nh);
		System.out.println("Checking if hash set is empty : "+h.isEmpty());
		nh.removeAll(h);
		System.out.println("After using removeAll New hash set : "+nh);
		nh.add("France");
		nh.add("Germany");
		 nh.removeIf(str->str.contains("France")); 
		 System.out.println("Remained New hash set is "+nh);
		nh.clear();
		System.out.println("After clearing New hash set : "+nh);
		        }


	}
	



}
