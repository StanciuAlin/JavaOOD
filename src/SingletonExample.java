/**
 * 
 */

/**
 * @author Alin Stanciu
 *
 */
public class SingletonExample {

	/**
	 * 
	 */
	private static SingletonExample singletonInstance;
	private SingletonExample() 
	{
		//
	}
	public static SingletonExample getSingletonInstance() 
	{
		if (null == singletonInstance) 
		{
			singletonInstance = new SingletonExample();
		}
		return singletonInstance;
	}
	public void methodA()
	{
		System.out.println("Inside print Singleton, method A");
	}
	public void methodB()
	{
		System.out.println("Inside print Singleton, method B");
	}
	

}
