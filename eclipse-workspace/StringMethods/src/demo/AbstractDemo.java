package demo;
class Circle extends Shape implements Printable, Count{

	public void print() {
		System.out.println("Print Circle");
	}
	public void color() {
		System.out.println("Print Circle color");
	}
	public void counts() {
		System.out.println("Counts Circle");
	}
	public Circle() {
		super();
		System.out.println("Circle Created");
	}
	public Circle(String color) {
		super(color);
		System.out.println("Circle created with Color");
	}
	public void draw() {
		System.out.println("Drawing a Circle");
	}
	Book b2 = new Book();
	//Book b=new Book();
}
class Rectangle extends Shape implements Printable{
	public void print() {
		System.out.println("Print Rectangle");
	}
	public void color() {
		System.out.println("Print Rectangle color");
	}
	public Rectangle() {
		super();
		System.out.println("Rectangle Created");
	}
	public Rectangle(String color) {
		super(color);
		System.out.println("Rectangle created with Color");
	}
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle myCircle[]=new Circle[2];
		Circle prints = new Circle();
		prints.print();
		prints.color();
		prints.counts();
		prints.draw();
	}

}
