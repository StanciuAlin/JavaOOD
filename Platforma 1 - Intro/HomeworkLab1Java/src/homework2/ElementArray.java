/**
 * 
 */
package homework2;

/**
 * @author Alin Stanciu
 *
 */
public class ElementArray {
	private Ecuation _ecuation = new Ecuation();

	/**
	 * @return the ecuation
	 */
	public Ecuation getEcuation() {
		return _ecuation;
	}

	/**
	 * @param ecuation the ecuation to set
	 */
	public void setEcuation(Ecuation ecuation) {
		this._ecuation = ecuation;
	}

	/**
	 * @param ecuation
	 */
	public ElementArray(Ecuation ecuation) {
		super();
		_ecuation = ecuation;
	}
	
	
}
