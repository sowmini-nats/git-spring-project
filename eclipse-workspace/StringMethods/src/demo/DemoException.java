package demo;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int c,a,b;
			try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("The result is: "+c);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Array element not found");
			}
			catch(ArithmeticException ex) {
				System.out.println("The second argument is 0");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("Checking Thread.sleep() method");
			try {
				Thread.sleep(3000);//milliseconds
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			
	}

}
