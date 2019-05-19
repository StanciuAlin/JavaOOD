/**
 * 
 */
package homework2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVWriter;

/**
 * @author Alin Stanciu
 *
 *
*/
public class Homework2Lab {

	private static final String COMMA_DELIMITER = null;


	/**
	 * @param args
	 * @throws IOException, MalformedInputException 
	 */
	public static void main(String[] args) throws IOException, MalformedInputException {
		// TODO Auto-generated method stub
		//Tema 1.3
		double a, b;
		ArrayList<Double> coef = new ArrayList<Double>();
		//read data      
		
       //read data
		int numberCoef = 2;
		while(numberCoef > 0)
		{
			String str = null;
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				a = Double.parseDouble(reader.readLine());
				coef.add(a);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				a = 0;
				coef.add(a);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("Incorrect format for number!");
				a = 0;
				coef.add(a);
			}
			numberCoef--;
		}
		Ecuation ecuation = new Ecuation(coef.get(0), coef.get(1));
		try {
			System.out.println(coef.get(0) + " * x + " + coef.get(1) + " = 0");
			
			Double result = Ecuation.SolveEcuation(ecuation);
			
			System.out.println("x is " + result);
		} catch (EcuationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Try another ecuation!");
		}
		//Tema 1.4
		//create a new array list with 20 elements
		ArrayList<Integer> objects = new ArrayList<>(20);
		
		//an object for generate random numbers
		Random rand = new Random();
		
		//add 20 elements in list
		for(int it = 0; it < 20; ++it)
		{
			objects.add(rand.nextInt(100));
		}
		
		System.out.print("Original order for list: ");
		//print the list in original order
		PrintArrayList(objects, 20);
		
		//sort the collection with use of API
		Collections.sort(objects);
		
		System.out.print("Sorted list: ");
		//print the list sorted
		PrintArrayList(objects, 20);
		
		//Tema 1.5
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in)); //read data from Console input
		int number1 = 0, number2 = 0;
		
		System.out.println(Integer.toBinaryString(~83));
		
		try {
			number1 = Integer.parseInt(reader1.readLine());
			number2 = Integer.parseInt(reader1.readLine());
			System.out.println(number1 + " + " + number2 + " = " + sum2Numbers(number1, number2));
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO reading error!");
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Incorrect format for number!");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Overflow!!!");
		}
		
		//Tema 1.6

		
		File file = new File("E:\\Java Projects\\Homework1LabJava\\InputFile.txt");
		BufferedReader readerFromFile = new BufferedReader(new FileReader(file));
		
		
		float numDoubles = 0;
		float sumDoubles = 0;
		
		int sumInteger = 0;
		int numInteger = 0;
		
		String str = null;
		while ((str = readerFromFile.readLine()) != null) {
			try {
				numInteger = Integer.parseInt(str);
				sumInteger += numInteger;
			} 
			catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				
				try {
					numDoubles = Float.parseFloat(str);
					sumDoubles += numDoubles;
				} 
				catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
//					e1.printStackTrace();
					//System.out.println("It was an incorrect data, no a Double!");
				}
				
				System.out.println("It was an incorrect data, no a Integer!");
			}
			finally
			{
				
			}
		}
		
		System.out.println("Sum for all Integers is " + sumInteger);
		System.out.println("Sum for all Floats is " + sumDoubles);
		
		readerFromFile.close();
		
		//Tema 1.7
		
		String searchedWord = null;
		StringBuffer strBuffer = new StringBuffer(100000);
		
		BufferedReader readerBuffer = null;
		try {
			File fileStringBuffer = new File("E:\\Java Projects\\Homework1LabJava\\FileStringBuffer.txt");
			readerBuffer = new BufferedReader(new FileReader(fileStringBuffer));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Introduce the word!");
			searchedWord = reader1.readLine();
			while((str = readerBuffer.readLine()) != null)
			{
				strBuffer.append(str).append("\n");
			}
			if(strBuffer.indexOf(searchedWord) > 0)
			{
				System.out.println("Word found!");
			}
			else 
			{
				System.out.println("Inexistent word!");
			}
			System.out.println(strBuffer);
			
			readerBuffer.close();
		}
		
		//Laborator 5 Gson
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		A a1 = new A(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		String json = gson.toJson(a1);
		System.out.println("a1 to JSON: " + json);
		json = "{\"g\":23,\"x\":23}";
		System.out.println("a1 to JSON: " + json);
		A a2 = gson.fromJson(json, A.class);
		System.out.println(a2.getX());
		
		
		GsonBuilder builder1 = new GsonBuilder();
		Gson gson1 = builder1.create();
		
		A1 aa1 = new A1(1, 2, 3);
		String json1 = gson1.toJson(aa1);
		System.out.println(json1);
		
		A2 aa2 = new A2(7, 8, 9);
		aa2 = gson.fromJson(json1, A2.class);
		aa1.PrintClassMessage("A1");
		aa2.IncrementA();
		System.out.println(aa2.getA());
		
		String strGson = null;
	    BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Java Projects\\LaboratorJava5\\StringJSON.txt"));
	    writer.write(json1);
	     
	    writer.close();
	    //write in file and handle with a Python program - checked
	    //today I handle with a C++ program 
	    
	    
	    //citim despre TCP/IP
	    
	    
	    
	    /*
	     * ToDo 1.28
	     */
	    //handle source code from website ACE Faculty
	    URL pageUrl = new URL("http://ace.ucv.ro/");
	    URLConnection getConn = pageUrl.openConnection();
	    getConn.connect();
	    BufferedReader dis = new BufferedReader(new InputStreamReader(getConn.getInputStream()));
	    String myString;
	    StringBuffer siteSource = new StringBuffer(1000000);
	    while ((myString = dis.readLine()) != null)
	    {
	    	//System.out.println(myString);
	    	siteSource.append(myString).append("\n");
	    }

	    Pattern p = Pattern.compile("(.*)\"tab_stire\">\\s<ul>\\s<li>\\s\\s\\s\\s\\s<h2>\\s\\s\\s\\s\\s<a href=(.*)>\\s(.*)<\\/a>");
	    Matcher m = p.matcher(siteSource);
	    System.out.println(siteSource);
	    System.out.println();
	    
	    m.find();
        System.out.println("First title from News tab is :" + m.group(3));
        
        m.find();
        System.out.println("Second title from News tab is :" + m.group(3));
        
        //and so on with next three titles :)
        
        
        
        /*
         * ToDo 1.29
         */
   
        String Tag = "a";															//tag for which search content
	    Pattern pTag = Pattern.compile("<" + Tag + "(.*)>(.*)<\\/" + Tag + ">");    //create a pattern for this site
	    Matcher mTag = pTag.matcher(siteSource);									//search a match for pattern in website source
//	    System.out.println(siteSource);
	    System.out.println();
	   
	    ArrayList<String> tags = new ArrayList<String>();   						//retain all tags extracted from website source
	    int orderTag = 2; 								    						//extract second group for tags content
	    while(mTag.find())															//while find a new match
	    {
	    	mTag.group(orderTag);													//extract group
	    	tags.add(mTag.group(orderTag));											//add this group to array tags
	    }
        System.out.println("Texts between selected tag are :" + tags.size());
        System.out.println();
        System.out.println("List of all tags in website is: ");
        System.out.println("\n\n");
        for (String string : tags) {
			System.out.println("\t" + string);
		}
        //and so on with next three titles :)
        
        /*
         * ToDo 1.30
         */
        
        /*
         * write in CSV format
         * header and values in CSV are hardcoded
         */
        String[] header = {"PolicyID,", "County,", "Latitude,", "Longitude,", "\n"};
        
        String pol = "123456,";
        String cou = "OLT,";
        String lat = "123.452345,";
        String longg = "123.532423";
        
        final char COMMA = ',';     								//const for retain comma sign
        final int NO_RECORDS = 10;									//const for retain no of records which are made in file
        ArrayList<String> linesCSV = new ArrayList<String>();		//an array to retain all lines of CSV file
        
        for (int i = 0; i < NO_RECORDS; i++) { 						//add all records to file
        	linesCSV.add(i, pol + cou + lat + longg + "\n");
		}
        
        /*
         * write the file in CSV file format
         */
        
        BufferedWriter outputCSV = null;
        try {
            File fileCSV = new File("example.csv"); 				//extern file where store data
            outputCSV = new BufferedWriter(new FileWriter(fileCSV));
            
            for (int i = 0; i < header.length; i++) {				//insert header in the CSV file
        	   outputCSV.write(header[i]);
            }
            
            for (int i = 0; i < NO_RECORDS; i++) { 					//write all records in CSV file
            	outputCSV.write(linesCSV.get(i));
			}
            
            
        } 
        catch ( IOException e ) 
        {
            e.printStackTrace();
        } 
        finally 
        {
			if ( outputCSV != null ) 
			{
				outputCSV.close();
			}
        }
        
        /*
         * read from a CSV:
         */
        String csvFile = "FL_insurance_sample.csv";
        String line = "";
        String cvsSplitBy = ",";
        System.out.println("Coordinates for every county in FL are: ");
        String[] country;
        int counter = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
        {

            while ((line = br.readLine()) != null && counter < 20) 
            {

                // use comma as separator
            	country = line.split(cvsSplitBy);
                System.out.println("\tPolicy ID: " + country[0] + ", County: " + country[2] + "With GPS coordinates: (latitude; longitude): (" + country[13] + ";" + country[14] + ")");
                counter++;
            }

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

	}
	public static void PrintArrayList(ArrayList<Integer> objects, int numberElements)
	{
		//print the list and a new line at the end of printing process
		for(int it = 0; it < numberElements; ++it)
		{
			System.out.print(objects.get(it) + " ");
		}
		System.out.println();
	}
	
	
	public static int sum2Numbers(int number1, int number2) throws ArithmeticException
	{
		int sum = number1 + number2;
		if (((number1 & number2 & ~sum) | (~number1 & ~number2 & sum)) < 0)
	        throw new ArithmeticException("int overflow add(" + number1 + ", " + number2 + ")");    
	    return sum;
	}
	
};
