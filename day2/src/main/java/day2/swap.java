package day2;

import java.util.Scanner;

public class swap {

	    public static void main(String a[])
	    {
	    	Scanner input = new Scanner (System.in);
			System.out.println("Enter x:");
			int x = input.nextInt();
			System.out.println("Enter y:");
			int y = input.nextInt();
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        System.out.println("After swaping:"
	                           + " x = " + x + ", y = " + y);
	    }
	}