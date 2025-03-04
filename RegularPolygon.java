package test1;

 // Test #1 by Brianna Canales
 // Challenge that finds type of polygon based on the number of sides and calculates its preimiter and area

import java.util.Scanner; 
import java.lang.Math; 
import java.util.logging.Logger;

public class RegularPolygon { 
	private static final Logger logger = Logger.getLogger(RegularPolygon.class.getName());

	public static void main(String[] args) {
		
		
		logger.info("The program will calculate the number of sides and length");
		logger.info("Enter the number of sides:");
		
		logger.info("Enter the length of the sides:");	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides:");
		int sides = input.nextInt();
		System.out.println("Enter the length of the sides:");
		double length = input.nextDouble();
		logger.info("The program will calculate the perimeter of the polygon");

		logger.info("The program will calculate the area of the polygon");

		// Calulate the perimeter and area of polygon and round to 2 decimal places
		double perimeter = sides * length;
		double area = (sides * Math.pow(length, 2))/4 * Math.tan(Math.PI/sides);
				logger.info("Perimeter: " + perimeter);
				logger.info("Area: " + area);
				
				System.out.println("Perimeter: " + perimeter);
				System.out.println("Area: " + area);
			}
		}
		


		

		
	
