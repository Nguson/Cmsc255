import java.util.Scanner;
public class CountLoop {

	public static void main(String[]args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("type an integer");
	int sum = 0;
	int n = 1;
	int max = input.nextInt();
		
		// Do Loop
		do {
			sum += n;
			n++;
			
		}
		while (n <= max);
		System.out.println(sum);
		
		
		//while loop
		n = 1;
		sum = 0;
		while (n <= max) {
			sum += n;
			n++;
			
		}
		System.out.println(sum);
		
		// for loop
		sum = 0;
		for(n = 1; n <= max; n++) {
			sum += n;
		}
		System.out.println(sum);
	}
		
		
}

