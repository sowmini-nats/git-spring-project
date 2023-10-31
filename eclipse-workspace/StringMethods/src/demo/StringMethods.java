/**
 * 
 */
package demo;
import java.util.Scanner;
/**
 * 
 */
public class StringMethods {

	/**
	 * @param 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.substring(2,4));
		System.out.println(str.length());
		System.out.println(str.concat("World"));
		System.out.println(str.replace("e","a"));
		System.out.println(str.contains("he"));
	}

}
