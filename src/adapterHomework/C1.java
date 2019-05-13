/**
 * 
 */
package adapterHomework;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alin Stanciu
 * @since May 13, 2019
 */
public class C1 implements IC1 {

	private Integer n1;
	private Integer n2;
	
	/**
	 * 
	 */
	public C1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Integer computeSumValueFromFile() {
	    return readFromFile();
	}
	
	private Integer sumOfArrayValues(ArrayList<Integer> array) {
		Integer sumOfArrayElements = 0;
		
		for (Integer integer : array) {
			sumOfArrayElements += integer;
		}
		
		return sumOfArrayElements;
	}
	
	/**
	 * @return the n1
	 */
	public Integer getN1() {
		return n1;
	}

	/**
	 * @return the n2
	 */
	public Integer getN2() {
		return n2;
	}

	private Integer readFromFile() {
		File f = null;
		Scanner scan = null;

		try {
		   f = new File("inputAdapter.txt");
		   scan = new Scanner(f);
		} catch(Exception exception) {
		   System.exit(0);
		}

		ArrayList<Integer> x = new ArrayList<Integer>();
//		
//		//Assuming that all data on the file are ints
//		while(scan.hasNext())
//		{
//			x.add(scan.nextInt());
//		}
		if (scan.hasNext()) {
			this.n1 = scan.nextInt();
			x.add(this.n1);
		} else {
			System.exit(0);
		}
		
		if (scan.hasNext()) {
			this.n2 = scan.nextInt();
			x.add(this.n2);
		} else {
			System.exit(0);
		}
		
		return sumOfArrayValues(x);
	}
}
