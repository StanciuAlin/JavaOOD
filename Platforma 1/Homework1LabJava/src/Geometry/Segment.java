/**
 * 
 */
package Geometry;

/**
 * @author Alin Stanciu
 *
 */
public class Segment implements Shape {

	private float _lengthSegment;
	/* (non-Javadoc)
	 * @see Geometry.Shape#getPerimeter()
	 */
	@Override
	public void getPerimeter() { //for segment represent segment length
		// TODO Auto-generated method stub
		System.out.println("Length of segment is: " + _lengthSegment);
	}
	/**
	 * @param _lengthSegment
	 */
	public Segment(float _lengthSegment) {
		super();
		this._lengthSegment = _lengthSegment;
	}
	/**
	 * @return the _lengthSegment
	 */
	public float get_lengthSegment() {
		return _lengthSegment;
	}
	/**
	 * @param _lengthSegment the _lengthSegment to set
	 */
	public void set_lengthSegment(float _lengthSegment) {
		this._lengthSegment = _lengthSegment;
	}

}
