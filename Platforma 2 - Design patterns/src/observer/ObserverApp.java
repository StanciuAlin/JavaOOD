/**
 * 
 */
package observer;

/**
 * @author Alin Stanciu
 *
 */
public class ObserverApp {

	/**
	 * 
	 */
	public ObserverApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtensionCord cord = new ExtensionCord();
		
		cord.addAppliances(new Oven());
		cord.addAppliances(new GasCooker());
		cord.addAppliances(new Fridge());
		
		cord.readNamePerson("Alex");
	}

}
