package demo;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		double num;
		double totalsalary=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Salary");
		num = sc.nextInt();
		if(num>=1 && num<=4000) {
			double hra = 10*num/100;
			double da = 50*num/100;
			totalsalary = num+hra+da;
		}
		else if(num>=4001 && num<=8000) {
			double hra = 20*num/100;
			double da = 60*num/100;
			totalsalary = num+hra+da;
		}
		else if(num>=8001 && num<=12000) {
			double hra = 25*num/100;
			double da = 70*num/100;
			totalsalary = num+hra+da;
		}
		else if(num>12000) {
			double hra = 30*num/100;
			double da = 80*num/100;
			totalsalary = num+hra+da;
		}
		System.out.println("Gross salary: "+totalsalary);
	}
}
