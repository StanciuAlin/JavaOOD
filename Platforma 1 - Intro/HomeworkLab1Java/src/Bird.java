/**
 * 
 */

/**
 * @author Alin Stanciu
 *
 */
public abstract class Bird {
	private float speed;
	
	/**
	 * @return the speed of bird
	 */
	public float getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	/**
	 * @param speed
	 */
	public Bird(float speed) {
		super();
		this.speed = speed;
	}
	void move()
	{
		//code to move bird
		speed += 1;
	}
	abstract void eat();
}
