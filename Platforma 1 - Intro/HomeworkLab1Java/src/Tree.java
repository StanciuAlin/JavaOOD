/**
 * 
 */

/**
 * @author Alin Stanciu
 *
 */
public abstract class Tree implements Plant {
	private float _height;
	private int _noRings;
	protected int _healthLevel;
	private final int _heathIndex = 10;

	/**
	 * @param _height
	 * @param _noRings
	 */
	public Tree(float _height) {
		super();
		this._height = _height;
		this._noRings = 0;
		this._healthLevel = 85;
	}

	/**
	 * @return the _noRings
	 */
	public int get_noRings() {
		return _noRings;
	}

	/**
	 * @param _noRings the _noRings to set
	 */
	public void set_noRings(int _noRings) {
		this._noRings = _noRings;
	}

	/**
	 * @return the _height
	 */
	public float get_height() {
		return _height;
	}

	/**
	 * @param _height the _height to set
	 */
	public void set_height(float _height) {
		this._height = _height;
	}
	
	/**
	 * @return the _healthLevel
	 */
	public int get_healthLevel() {
		return _healthLevel;
	}

	/**
	 * @param _healthLevel the _healthLevel to set
	 */
	public void set_healthLevel(int _healthLevel) {
		this._healthLevel = _healthLevel;
	}
	
	@Override
	public void growPlant()
	{
		_height += 30; //increase with 30 cm in height
		_noRings++; //add one ring to stem
	}
	
	@Override
	public void decreaseHealth()
	{
		_healthLevel -= _heathIndex;
	}
	@Override
	public void increaseHealth()
	{
		_healthLevel++;
	}
	
	@Override
	public void checkHealth()
	{
		
	}
}
