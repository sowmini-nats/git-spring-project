package demo;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit number:");
		int num = sc.nextInt();
		if(num>=1000&&num<=9999) {
		int r=0,value=0;
		int original = num;
		while(num>0) {
			 r = num%10;
			value = value*10+r;
			num = num/10;
			
		}
		System.out.println(value);
		if(value==original)
			System.out.println("Given number is a palindrome");
		else 
			System.out.println("Given number is not a palindrome");
		}
		else 
			System.out.println("Enter only 4-digit number");
	}

}
