import java.util.Scanner;

public class Exercise03_01{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //ask user for values 
        System.out.print(" Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double discriminant = (Math.pow(b, 2) - 4 * a * c);
		//System.out.println(discriminant);
        
		if (discriminant > 0){
			double r1 = (double)((b * -1) + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = (double)((b * -1) - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
		else if (discriminant == 0){
			double r1 = (double)((b * -1) + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println(" The equation has one root " + r1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
    
    }
}
