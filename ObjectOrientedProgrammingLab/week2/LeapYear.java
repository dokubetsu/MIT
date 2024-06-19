package week2;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year;
		year = sc.nextInt();
		boolean isLeap = false;
		if(year%4!=0)
			isLeap=false;
		else if(year%100!=0)
			isLeap=true;
		else if(year%400!=0)
			isLeap=false;
		else
			isLeap=true;
		if (isLeap)
			System.out.println("The year "+year+" is a leap year.");
		else
			System.out.println("The year "+year+" is not a leap year");
		
					
		}
		
		
	}
