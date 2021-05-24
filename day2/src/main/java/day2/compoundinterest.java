package day2;

import java.util.Scanner;

public class compoundinterest {

	public static void main(String[] args) {
			      Scanner input = new Scanner (System.in);
					System.out.println("Enter principal :");
					 double p = input.nextDouble();
						System.out.println("Enter rate of interest:");
						 double r = input.nextDouble();
							 System.out.println("Enter time in years :");
							 double t = input.nextDouble();
							 System.out.println("Enter number of times it is compounded in year :");
							 double n = input.nextDouble();
							 
			      double comp_int = p *(Math.pow((1 + (r/n)), (n*t)));
			      System.out.println("The compound interest for the given principle amount, rate and time is "+          comp_int);
			   }
			}
