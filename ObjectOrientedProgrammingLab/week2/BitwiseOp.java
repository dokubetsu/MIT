package week2;
import java.util.Scanner;

public class BitwiseOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println("Enter another number: ");
		b = sc.nextInt();
		int carry=0;
		while(b!=0) {
			int sum=a ^ b;
			carry = a & b;
			
			a= a^b;
			b= carry<<1;}
		System.out.println("Sum is: "+a);
		if (a%2==0)
			System.out.println("number is even");
		else
			System.out.println("Number is odd");
			
			
			

	}

}
