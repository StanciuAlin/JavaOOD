/**
 * 
 */
package observer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alin Stanciu
 *
 */
public class ExtensionCord implements ObserverExtensionCord {

	/**
	 * 
	 */
	private String _namePerson = null;
	ArrayList<Appliance> appliances = new ArrayList<Appliance>();
	
	public ExtensionCord() {
		// TODO Auto-generated constructor stub
	}
	
	public void readNamePerson(String namePerson) {
		_namePerson = namePerson;
		notifyAppliance();
	}
	
	/* (non-Javadoc)
	 * @see observer.ObserverExtensionCord#addAppliances(observer.Appliance)
	 */
	@Override
	public void addAppliances(Appliance appliance) {
		// TODO Auto-generated method stub
		appliances.add(appliance);
	}

	/* (non-Javadoc)
	 * @see observer.ObserverExtensionCord#removeAppliance(observer.Appliance)
	 */
	@Override
	public void removeAppliance(Appliance appliance) {
		// TODO Auto-generated method stub
		appliances.remove(appliance);
	}

	/* (non-Javadoc)
	 * @see observer.ObserverExtensionCord#notifyAppliance()
	 */
	@Override
	public void notifyAppliance() {
		// TODO Auto-generated method stub
		int action = readInput();
		switch (action) {
		case 1:
			for (Appliance appliance : appliances) {
				appliance.plugIn(_namePerson);
			}
			break;
		case 0:
			for (Appliance appliance : appliances) {
				appliance.plugOut(_namePerson);
			}
			break;
		default:
			break;
		}
	}

	private int readInput() {
		
		Scanner scanner = new Scanner(System.in);
		int decision = 0;
		System.out.println("Take a decision:\n 0 -> Plug out.\n 1 -> Plug in.\n");
		try {
			decision = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please insert a valid number.");
		}
		scanner.close();
		return decision;
	}
	
}
