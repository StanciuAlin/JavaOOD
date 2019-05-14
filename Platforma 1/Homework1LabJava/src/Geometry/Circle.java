/**
 * 
 */
package Geometry;

/**
 * @author Alin Stanciu
 *
 */
public class Circle extends Shape2D {

	private float _radius;
	/**
	 * @return the _radius
	 */
	public float get_radius() {
		return _radius;
	}

	/**
	 * @param _radius the _radius to set
	 */
	public void set_radius(float _radius) {
		this._radius = _radius;
	}

	/**
	 * @param _radius
	 */
	public Circle(float _radius) {
		super();
		this._radius = _radius;
	}

	/* (non-Javadoc)
	 * @see Geometry.Shape#getPerimeter()
	 */
	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Circle perimeter is: " + 2 * Math.PI * _radius);
	}

	/* (non-Javadoc)
	 * @see Geometry.Shape2D#getAria()
	 */
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Circle area is: " + Math.PI * _radius * _radius);
	}

}
