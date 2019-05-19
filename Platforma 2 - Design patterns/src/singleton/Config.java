/**
 * 
 */
package singleton;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Alin Stanciu
 * @version 1
 *
 */
public class Config 
{

	/**
	 * @counterForSingletonInstance - number of copy for first instance created
	 * @formatColor - a code for color like "#RRGGBB"
	 * @name - name for configuration process
	 * @weight - auxiliar variable
	 * @instance - singleton object for configuration process
	 */
	public static int counterForSingletonInstance = 1;
	public String formatColor = "#RRGGBB";
	public String name;
	public Long weight;
	
	private static Config instance; //instance static
	
	/**
	 * implicit constructor
	 */
	private Config()
	{
		//do nothing
	}
	
	/**
	 * 
	 * @param formatColor
	 * @param name
	 * @param weight
	 */
	private Config(String formatColor, String name, Long weight) 
	{ 
		//private constructor to not allow instantiate from outside
		// TODO Auto-generated constructor stub
		this.formatColor = formatColor;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * 
	 * @param fileName - input path for our file where is Json string
	 * @return Config instance
	 */
	public static Config getInstance(String fileName) 
	{ 
		//get single object
		JSONObject input = null;
		if(null == instance) //do not create an instance for Config class
		{
			try 
			{
				input = (JSONObject) Config.readJson("input.txt");
			}
			catch (Exception exception) 
			{
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}
			instance = Config.readJsonFromFile(fileName, input);
			return instance;
		}
		
		//else if exist an instance, then return it
		return instance;
	}
	
	/**
	 * util function for read from file at first access
	 * @param fileName - path for Json string
	 * @param input - JSON object for read from file
	 * @return Config instance with all params updated from Json string
	 */
	private static Config readJsonFromFile(String fileName, JSONObject input)
	{
		Config firstConfiguration = new Config(
	    		  (String) input.get("formatColor"),
	    		  (String) input.get("name"),
	    		  (Long) input.get("weight"));
		
		return firstConfiguration;
	}
	
	/**
	 * 
	 * @param fileName - path for Json string
	 * @return Json Object obtained from parsing process
	 * @throws Exception
	 */
	private static Object readJson(String fileName) throws Exception 
	{  
	    FileReader reader = new FileReader(fileName);
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
	
}
