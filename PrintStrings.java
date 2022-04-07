import java.util.Scanner;

public class PrintStrings {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words with a space in between");
		String word1 = input.next();
		String word2 = input.next();
		
		if (word1.compareTo(word2) < 0) {
			
			System.out.println(word1 + " " + word2);
			
		} 
		else if (word1.compareTo(word2) > 0) {
			
			System.out.println(word2 + " " + word1);
		}
		else {
			
			System.out.println(word1);
		}
	  
	}
}