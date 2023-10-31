package demo;
import java.util.Scanner;
public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee[] user = new Employee[5];
		int iage;
		double basic;
		double hra,da,specialallowance;
		String iname;
		String valid;
		for(int i=0;i<5;i++) {
			System.out.println("Enter your name: ");
			iname = sc.next();
			System.out.println("Enter your age: ");
			iage = sc.nextInt();
			System.out.println("Enter your basic salary: ");
			basic = sc.nextDouble();
			System.out.println("Enter your hra: ");
			hra = sc.nextDouble();
			System.out.println("Enter your da: ");
			da = sc.nextDouble();
			
			user[i] = new Employee(iage,iname);
			System.out.println("Do you have special allowance? Y/N");
			valid = sc.next();
			if(valid.equals("Y")) {
				System.out.println("Enter special allowance: ");
				specialallowance = sc.nextDouble();
				user[i].calculateSalary(basic, hra, da,specialallowance);
			}
			else if(valid.equals("N")){
			user[i].calculateSalary(basic, hra, da);
			}
		}
		System.out.println("Salary of all employees:");
		for(int i=0;i<5;i++) {
			user[i].getsalary();
		}
				
	}

}

		