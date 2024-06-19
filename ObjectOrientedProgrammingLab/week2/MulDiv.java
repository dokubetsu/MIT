package week2;
import java.util.Scanner;

public class MulDiv {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int e = sc.nextInt();
		int mul=a<<e;
		System.out.println("Multipliclation: "+mul);
		double div=a>>e;
		System.out.println("Division: "+div);
		
		

	}

}
