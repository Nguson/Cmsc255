import java.util.Scanner;

public class MiddleString {
	
	public static void main(String[]args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter three strings:");
		String str1 = scnr.next();
		String str2 = scnr.next();
		String str3 = scnr.next();
		
		if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0){
			
			if (str2.compareTo(str3) < 0) {
				System.out.println(str2);
			}
			else {
				System.out.println(str3);
			}
		}
		else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0){
			
			if (str1.compareTo(str3) < 0) {
				System.out.println(str1);
			}
			else {
				System.out.println(str3);
			}
		}
		else if (str3.compareTo(str1) < 0 && str3.compareTo(str2) < 0) {
			if (str2.compareTo(str1) < 0) {
				System.out.println(str2);
			}
			else {
				System.out.println(str1);
			}
		}
		else if (str1.compareTo(str2) == 0) {
				
			if (str1.compareTo(str3) < 0) {
				System.out.println(str1);
			}
			else {
				System.out.println(str3);
			}
		}
		else if (str2.compareTo(str3) == 0) {
			
			if (str2.compareTo(str1) < 0) {
				System.out.println(str2);
			}
			else {
				System.out.println(str1);
			}
		}
		else if (str1.compareTo(str2) == 0 && str1.compareTo(str3) == 0) {
			System.out.println(str1);
		}
		
		else {
			System.out.println(str3);
		}
		
	}
	
}
