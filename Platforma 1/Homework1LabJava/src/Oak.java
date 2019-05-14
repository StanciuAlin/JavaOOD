/**
 * 
 */

/**
 * @author Alin Stanciu
 *
 */
public class Oak extends Tree{

	/**
	 * @param _height
	 */
	public Oak(float _height) {
		super(_height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see Tree#checkHealthLevel()
	 */
	@Override
	public void checkHealth() {
		// TODO Auto-generated method stub
		if(_healthLevel == 0)
		{
			System.out.println("Dry tree! :(");
		} 
		else if(_healthLevel > 0 && _healthLevel < 30)
		{
			System.out.println("Tree in danger for drying!");
		}
		else if (_healthLevel >= 30 && _healthLevel < 70)
		{
			System.out.println("Tree health is good!");
		}
		else if(_healthLevel >= 70 && _healthLevel <= 100)
		{
			System.out.println("Tree is healthy!!! :)");
		}
	}

}
