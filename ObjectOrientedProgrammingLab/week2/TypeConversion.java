package week2;
import java.util.Scanner;
public class TypeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int intvalue = sc.nextInt();
		System.out.println("Enter a double value: ");
		double doublevalue = sc.nextDouble();
		System.out.println("Enter a character: ");
		char charvalue = sc.next().charAt(0);
		byte intTobyte = (byte)intvalue;
		byte doubleTobyte = (byte)doublevalue;
		int doubleToint = (int)doublevalue;
		int charToint = (int)charvalue;
		
		System.out.println("int to byte: "+intTobyte);
		System.out.println("double to byte: "+doubleTobyte);
		System.out.println("double to int: "+doubleToint);
		System.out.println("char to int: "+charToint);
		

	}

}
