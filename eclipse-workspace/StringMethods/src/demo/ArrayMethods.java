/**
 * 
 */
package demo;
import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * 
 */
public class ArrayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,5,8};
		for(int data:arr)
			System.out.println(data);
		System.out.println("-----");
		int value=Array.getLength(arr);
		System.out.println(value);
		
		
		
	}

}
