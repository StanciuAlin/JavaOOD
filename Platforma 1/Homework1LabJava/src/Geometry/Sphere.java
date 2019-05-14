/**
 * 
 */
package Geometry;

/**
 * @author Alin Stanciu
 *
 */
public class Sphere extends Shape3D {

	/**
	 * @param _radius
	 */
	public Sphere(float _radius) {
		super();
		this._radius = _radius;
	}
	private float _radius;
	/* (non-Javadoc)
	 * @see Geometry.Shape3D#getVolume()
	 */
	@Override
	public void getVolume() {
		// TODO Auto-generated method stub
		System.out.println("Sphere volume is: " + ((4 * Math.PI * _radius * _radius * _radius) / 3) * 1.0);
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Sphere area is: " + 4 * Math.PI * _radius * _radius);
	}
	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		
	}

	
}
