/**
 * 
 */
package homework2;

/**
 * @author Alin Stanciu
 *
 */
public class A1 {
	private int a;
	private int b;
	private int c;
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public A1(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	
	public void PrintClassMessage(String nameClass)
	{
		System.out.println("Mesaj din clasa " + nameClass);
	}
}
