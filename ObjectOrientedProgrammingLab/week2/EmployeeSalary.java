package week2;
import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours worked: ");
		double whours=sc.nextDouble();
		System.out.println("Enter the hourly rate: ");
		double hrate =sc.nextDouble();
		double reghours=0.00;
		double othours=0.00;
		double totsal=0;
		if (whours>40)
			othours=whours-40;
		double regpay=reghours*hrate;
		double otpay=othours*hrate*1.5;
		if (whours<=40)
			totsal=regpay;
		else 
			totsal=(40*hrate)+(otpay);
		System.out.println("Employee's salary is: "+totsal);
		
		
		

	}

}
