import java.util.Scanner;
public class Exercise 
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int days = (minutes % 525600) / 1440;
        int years = minutes / 525600;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
        
    }
}