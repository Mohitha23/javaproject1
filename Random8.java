package myproject2;

public class Random8 {
	public static void main(String[] args) {

        int n1 = 4, n2 = 45, n3 = 450;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }

}
