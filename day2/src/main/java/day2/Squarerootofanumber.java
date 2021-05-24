package day2;

import java.util.Scanner;

public class Squarerootofanumber
{
	static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;
 
        // Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;
         
        while (result <= x) 
        {
            i++;
            result = i * i;
        }
        return i - 1;
    }

		    
		    
		    public static void main(String[] args)
		    {
		    	 Scanner input = new Scanner (System.in);
					System.out.println("Enter a number :");
					 int p = input.nextInt();
		        System.out.print(floorSqrt(p));
		    }
		}

