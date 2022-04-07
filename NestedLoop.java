import java.util.Scanner;
public class NestedLoop {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("how many rows do you want");
		int rowsUser = input.nextInt();
		
		
		for(int rows = 1; rows <= rowsUser; rows++) {
			
			
			for (int stars = 1; stars <= rowsUser; stars++){ 
				
				if (stars <= rows) {
				System.out.print("* ");
				}
			}
			System.out.println();
				
			}
			
		for(int rows = 1; rows <= rowsUser; rows++) {
			
			for (int stars = rowsUser; stars >= rows; stars--) {
                System.out.print(" ");
            }
			for (int stars = 1; stars <= rows; stars++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		
}
	
}