/**
 * 
 */

/**
 * @author Alin Stanciu
 *
 */
import java.util.Random;

import Geometry.Exception3D;

import java.io.*;


public class GenRandomArray {
	private int _indexRandom;

	/**
	 * @param _indexRandom
	 */
	public GenRandomArray(int _indexRandom) {
		super();
		this._indexRandom = _indexRandom + 1;
	}

	/**
	 * @return the _indexRandom
	 */
	public int get_indexRandom() {
		return _indexRandom;
	}

	/**
	 * @param _indexRandom the _indexRandom to set
	 */
	public void set_indexRandom(int _indexRandom) {
		this._indexRandom = _indexRandom;
	}
	
	float genNo() throws ArithmeticException, Exception3D //throw an exception and catch in main function
	{
		Random rand = new Random();
		int x = rand.nextInt(1000);
		throw new Exception3D("fssd");
//		return 1 / x;
	}
	
	float[] gen(int size) //treat exception exactly in function(on place)
	{
		/*
		 * to avoid divide by 0 we can add 1 at random function result.
		 */
		
		float[] temporaryArray = new float[size];
		//float temt[] = new float[199];
		Random rand = new Random();
		
		
		for(int i = 0; i < size; ++i)
		{
			try {
				temporaryArray[i] = (float) (1 / (rand.nextInt(_indexRandom)) * 1.0);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println("Divided by 0!");
				temporaryArray[i] = 0;
				e.printStackTrace();
			}
		}
		
		return temporaryArray;
	}
	public void givenWritingStringToFile_whenUsingFileOutputStream_thenCorrect() 
			  throws IOException {
			    String str = "Hello";
			    FileOutputStream outputStream = new FileOutputStream("daa.docx");
			    byte[] strToBytes = str.getBytes();
			    outputStream.write(strToBytes);
			 
			    outputStream.close();
			}
	
}
