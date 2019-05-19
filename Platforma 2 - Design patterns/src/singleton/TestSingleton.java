/**
 * 
 */
package singleton;

import java.io.IOException;
/**
 * @author Alin Stanciu
 *
 */
public class TestSingleton 
{
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		System.out.println(Config.getInstance("input.txt"));
		
		for (int i = 0; i < 10; i++) 
		{
			Config cfg = Config.getInstance("input.txt");
			TestSingleton.printInstace(cfg);
		}
	}
	
	/**
	 * util function to print field values for singleton object
	 * @param instance - Config instance
	 */
	private static void printInstace(Config instance)
	{
		Config.counterForSingletonInstance++;
		System.out.println(
				"Instance copy: " + Config.counterForSingletonInstance + " " + instance.formatColor + " " + instance.name + " " + instance.weight + '\n'
				);
	}

}
