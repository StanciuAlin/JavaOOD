/**
 * 
 */
package Geometry;

/**
 * @author Alin Stanciu
 *
 */
public class Cube extends Shape3D {

	private float _side;
	/**
	 * @return the _side
	 */
	public float get_side() {
		return _side;
	}
	/**
	 * @param _side the _side to set
	 */
	public void set_side(float _side) {
		this._side = _side;
	}
	/**
	 * @param _side
	 */
	public Cube(float _side) {
		super();
		this._side = _side;
	}
	/* (non-Javadoc)
	 * @see Geometry.Shape3D#getVolume()
	 */
	@Override
	public void getVolume() {
		// TODO Auto-generated method stub
		System.out.println("Cube volume is: " + _side * _side * _side);
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Cube area is: " + 6 * _side * _side);
	}
	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Cube perimeter is: " + 12 * _side);
	}
	
}
