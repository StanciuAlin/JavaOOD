/**
 * 
 */
package Lab4;

import java.io.Serializable;

/**
 * @author Alin Stanciu
 *
 */
public class A implements Serializable {
	private int x;
	private String y;
	public A(int x, String y) {
	this.x = x;
	this.y = y;
	}
	public int getX() {
	return x;
	}
	public String getY() {
	return y;
	}
}
