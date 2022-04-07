/*
*Martian houses
*
*takes length of house, and name. Outputs cost and surface area
*
*Minh Nguyen
*9/30/2021
*cmsc 255-001
*/
import java.util.Scanner;
public class MartianHouses {

	public static void main(String[]args) {
		
		//creation of scanner
		Scanner input = new Scanner(System.in);
		// I created a string data type and gave it a temporary value
		String answer = "temp";
		//beginning of loop
		do {
		//asking the user for input
		System.out.println("Enter the settler's name:");
		String settlerName = input.nextLine();
		
		System.out.println("Enter the length of a side of the house:");
		double side = input.nextDouble();
		//start of conversion
		answer = input.nextLine();
		double roof = (2 * Math.pow(side, 2)) * (1 + Math.sqrt(2));
		double floor = roof;
		double wall = (8 * 12 * side);
		double totalSurfaceArea = floor + roof + wall;
		double cost = totalSurfaceArea * 14.50;
		System.out.printf(settlerName + " has a house surface area of %,.2f and cost of $%,.2f", totalSurfaceArea, cost);
		
		
		//asks if user would like to enter more values
		System.out.println("\nWould you like to enter another house? Enter no to exit.");
		
		answer = input.nextLine();
		/*
		loops if the answer is anything but no. I did answer.equalsIgnoreCase("yes")
		but changed it because gradescope didint give me points
		*/
		} while(!answer.equalsIgnoreCase("no"));	
	
	}
}