/**
 * 
 */
package homework2;

/**
 * @author Alin Stanciu
 *
 */
public class Ecuation {
	/**
	 * 
	 */
	public Ecuation() {
		super();
	}

	private double a;
	private double b;
	/**
	 * @param a
	 * @param b
	 */
	public Ecuation(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}
	
	static Double SolveEcuation(Ecuation ecuation) throws EcuationException
	{
		
		if(ecuation.a == 0)
		{
			if(ecuation.b == 0)
			{
				return null;
			} 
			else
			{
				throw new EcuationException("The ecuation has no solution!");
			}
		}
		return -ecuation.b / ecuation.a;
	}
	public void WriteEcuation()
	{
		System.out.println(this.a + " + " + this.b + " = 0");
	}
	public int compareTo(Ecuation ecuation) {
		// TODO Auto-generated method stub
		return 0;
	}
}
