/**
 * 
 */
package observer;

/**
 * @author Alin Stanciu
 *
 */
public class GasCooker implements Appliance {

	/**
	 * 
	 */
	public GasCooker() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see observer.Appliance#plugIn(java.lang.String)
	 */
	@Override
	public void plugIn(String namePerson) {
		// TODO Auto-generated method stub
		System.out.println("The gas cooker was pluged in by " + namePerson + '\n');
	}

	/* (non-Javadoc)
	 * @see observer.Appliance#plugOut(java.lang.String)
	 */
	@Override
	public void plugOut(String namePerson) {
		// TODO Auto-generated method stub
		System.out.println("The gas cooker was pluged out by " + namePerson + '\n');
	}

}
