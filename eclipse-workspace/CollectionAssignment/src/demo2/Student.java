package demo2;


public class Student{
	private int rollNo; 
	private String name; 
	Student(){
		rollNo=0;
		name="Unknown";
	}
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Roll number: "+this.rollNo+"\nName: "+this.name;
	}
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.getName());
//	}

}
