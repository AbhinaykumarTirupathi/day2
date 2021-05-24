package day2;

import java.util.Scanner;

public class farenheittocentrigrade {

	public static void main(String[] args)  
	{      
		float Fahrenheit, Celsius; 
	Scanner input = new Scanner (System.in);
	System.out.println("Enter in Fahrenheit:");
	Fahrenheit = input.nextFloat();
		       
		          Celsius  = ((Fahrenheit-32)*5)/9;  
		          System.out.println("Temperature in celsius is: "+Celsius);  
		    } 
	}
