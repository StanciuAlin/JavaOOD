/**
 * 
 */
package adapterHomework;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Alin Stanciu
 *
 */
public class AppAdapter {

	/**
	 * @param args
	 * @param scanner
	 * @param inutString
	 * @param C2
	 * @param C1Adapter
	 * For example:
	 * inputString = {"n1": 120,"n2": 121}
	 * The output is: 
	 * First method with direct call for C2 ctor:
	 * 241
	 * Second method with an adapter
	 * 241
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C1 c1 = new C1();
		//System.out.println(c1.computeSumValueFromFile());
		
        System.out.println("Please enter a Json string with 2 values:");
        Scanner scanner = null;
        String inputString = null;
        try {
			scanner = new Scanner(System.in);
			inputString = scanner.nextLine().toString();
		} catch (NullPointerException ex) {
			System.out.println("Something was wrong in reading Json string.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something was wrong in reading Json string.");
		}
		
        System.out.println("First method with direct call for C2 ctor:");
		C2 c2 = new C2(inputString);
		System.out.println(c2.computeSum(inputString));
		
		System.out.println("Second method with an adapter");
		C1Adapter adapter = new C1Adapter(new C2(inputString));
		System.out.println(adapter.computeSum(inputString));
	}

}
