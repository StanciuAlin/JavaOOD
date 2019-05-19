/**
 * 
 */
package observer;

/**
 * @author Alin Stanciu
 *
 */
public interface ObserverExtensionCord {
	public void addAppliances(Appliance appliance);
	public void removeAppliance(Appliance appliance);
	public void notifyAppliance();
}
