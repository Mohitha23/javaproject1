package test;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class One36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		al.add("Six");
		al.add("Seven");
		al.add("Eight");
		al.add("Nine");
		al.add("Ten");
		java.util.Iterator<String> it =  al.iterator();
        while (it.next() != null)
            System.out.print(it.next() + " ");
		al.add(3,"New");
		al.remove(2);
		al.set(3,"Replaced Four");
		System.out.println(al.contains("Replaced Four"));
		System.out.println(al.get(3));
		System.out.println("Size is "+al.size());
		while (it.next() != null)
            System.out.print(it.next() + " ");
        ArrayList<String> al2=new ArrayList<>();
        al2=al;
		al.removeAll(al2);
		System.out.println("Final size="+al.size());
	}


}
