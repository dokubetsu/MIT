package week2;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string(a): ");
		String a = sc.nextLine();
		System.out.println("Enter a number(num): ");
		int b = sc.nextInt();
		
		int c=b;
		b = Integer.parseInt(a);
		a = c+"";
		//String c = a;
		//b=Integer.parseInt(c);
		//a = String.valueOf(b);
		
		
		System.out.println("After swap a= "+a);
		System.out.println("After swap b = "+b);
		
		
	}

}
