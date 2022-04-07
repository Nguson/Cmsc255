import java.util.Scanner;

public class lab4 {

	public static void main(String[]args) {
	
	Scanner input = new Scanner(System.in);
	
	// prompt user to enter a letter
	System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
	
	char character = input.next().charAt(0);
	
	
	character = Character.toUpperCase(character);
	
	
	if (character == 'A' || character == 'B' || character == 'C') { 
		
		System.out.println("The digit 2 corresponds to the letter " + character + " on the telephone.");
		
	}
	
	else if (character == 'D' || character == 'E' || character == 'F') {
		
		System.out.println("the digit 3 corresponds to the letter " + character + " on the telephone.");
	}
	else if (character == 'G' || character == 'H' || character == 'I') {
		
		System.out.println("the digit 4 corresponds to the letter " + character + " on the telephone.");
	}
	else if (character == 'J' || character == 'K' || character == 'L') {
		
		System.out.println("the digit 5 corresponds to the letter " + character + " on the telephone.");
	}
	else if (character == 'M' || character == 'N' || character == 'O') {
		
		System.out.println("the digit 6 corresponds to the letter " + character + " on the telephone.");
	}
	else if (character == 'P' || character == 'Q' || character == 'R' || character == 'S') {
		
		System.out.println("the digit 7 corresponds to the letter " + character + " on the telephone.");
	}
	else if (character == 'T' || character == 'U' || character == 'V') {
		
		System.out.println("the digit 8 corresponds to the letter " + character + " on the telephone.");
	}
	else if (character == 'W' || character == 'X' || character == 'Y' || character == 'Z') {
	
	System.out.println("the digit 9 corresponds to the letter " + character + " on the telephone.");
	}
}

}
