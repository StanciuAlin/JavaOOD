package adapterHomework;

import adapter.Bird;
import adapter.ToyDuck;

public class C1Adapter implements IC2 {

	/**
	 * 
	 */
	public C1Adapter() {
		super();
	}

	IC2 object;
	
	public C1Adapter(IC2 object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}
	
	@Override
	public Long computeSum(String jsonString) {
		object = new C2(jsonString);
		return object.sumOfValuesFromJsonString(jsonString);
	}

	@Override
	public Long sumOfValuesFromJsonString(String jsonString) {
		// TODO Auto-generated method stub
		return null;
	}
}