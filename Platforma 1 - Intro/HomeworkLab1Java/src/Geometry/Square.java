/**
 * 
 */
package Geometry;

/**
 * @author Alin Stanciu
 *
 */
public class Square extends Shape2D {
	
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
	public Square(float _side) {
		super();
		this._side = _side;
	}

	/* (non-Javadoc)
	 * @see Geometry.Shape#getPerimeter()
	 */
	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Square perimeter is: " + _side * 4);
	}

	/* (non-Javadoc)
	 * @see Geometry.Shape2D#getAria()
	 */
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Square area is: " + _side * _side);
	}

}
