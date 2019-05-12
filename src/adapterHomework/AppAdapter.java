/**
 * 
 */
package adapterHomework;

/**
 * @author Alin Stanciu
 *
 */
public class AppAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C1 c1 = new C1();
		//System.out.println(c1.computeSumValueFromFile());
		C2 c2 = new C2("{\"n1\":120,\"n2\":121}");
		System.out.println(c2.sumOfValuesFromJsonString());
	}

}
