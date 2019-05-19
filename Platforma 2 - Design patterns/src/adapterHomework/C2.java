/**
 * 
 */
package adapterHomework;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author Alin Stanciu
 *
 */
public class C2 implements IC2{
	/**
	 * 
	 */
	
	private String jsonString = null;
	
	public C2(String jsonString) {
		// TODO Auto-generated constructor stub
		this.jsonString = jsonString;
	}
	
	@Override
	public Long computeSum(String jsonString) {
		return sumOfValuesFromJsonString(jsonString);
	}
	
	@Override
	public Long sumOfValuesFromJsonString(String jsonString) {
		return sumOfValues(parseJsonString(jsonString));
	}
	
	private ArrayList<Long> parseJsonString(String jsonString) {
		Object obj = null;
		try {
			obj = new JSONParser().parse(jsonString);
		}
		catch (ParseException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		} 
        
        // typecasting obj to JSONObject 
        JSONObject jsonObj = (JSONObject) obj; 
          
        // getting firstName and lastName
        ArrayList<Long> array = new ArrayList<Long>();
        
        Long n1 = (Long) jsonObj.get("n1"); 
        array.add(n1);
        Long n2 = (Long) jsonObj.get("n2"); 
        array.add(n2);
        
        return array; 
	}
	
	private Long sumOfValues(ArrayList<Long> array) {
		Long sumOfValues = 0L;
		
		for (Long long1 : array) {
			sumOfValues += long1;
		}
		
		return sumOfValues;
	}

}
