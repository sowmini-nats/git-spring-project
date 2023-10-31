package demo;

public class Employee {
	public int age;
	public double salary;
	public String name;
	Employee(){
		salary=0.0;
		age =0;
		name="unknown";
	}
	Employee(int iage,String iname){
		age = iage;
		name = iname;
	}
	public void calculateSalary(double basic,double hra,double da,double specialallowance) {
		salary = basic+hra+da+specialallowance;
	}
	public void calculateSalary(double basic,double hra,double da) {
		int specialallowance = 0;
		salary=basic+hra+da+specialallowance;
	}
	public void getsalary() {
		System.out.println("Salary of "+name+": "+salary);
	}
}
