package AverageAge;

import java.util.Scanner;
public class AverageAge 
{
	public static void main(String[] args) 
	{
		int val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in);
		
		// get three ages from the user
		
		System.out.println("Enter three ages and I will compute their average.");
		
        // Ask for and read the first age
        System.out.print("Enter the first age: ");
        val1 = scan.nextInt();
        
        // Ask for and read the second age
        System.out.print("Enter the second age: ");
        val2 = scan.nextInt();
        
        // Ask for and read the third age
        System.out.print("Enter the third age: ");
        val3 = scan.nextInt();

        // Compute the average
        average = (val1 + val2 + val3) / 3.0;

        // Print the average (note decimals in the display)
        System.out.println("The average age is: " + average + ".");

	}

}
