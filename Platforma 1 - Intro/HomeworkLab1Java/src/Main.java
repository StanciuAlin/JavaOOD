import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import Geometry.*;
import Lab4.A;

/**
 * 
 */

/**
 * @author Alin Stanciu
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception3D 
	 */
	public static void main(String[] args) throws IOException, Exception3D {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------------------------");
		System.out.println("OOP classes(abstract, interfaces) part:");
		Tree firstTree = new Oak(100);
		//Tree exp = new Tree(10); cannot instantiate the type Tree
		
		for (int i = 0; i < 5; i++) { //iterate in 5 years
			firstTree.growPlant();
			firstTree.increaseHealth();
		}
		
		for (int i = 0; i < 5; i++) { //iterate in 5 years
			firstTree.growPlant();
			firstTree.decreaseHealth();
		}
		System.out.println("This tree has " + firstTree.get_noRings() + " years.");
		System.out.println("------------------------------------------------------------");
		System.out.println("Shape part:");
		
		Shape segment = new Segment(10);
		Shape2D square = new Square(10);
		Shape2D circle = new Circle(20);
		Shape3D cube = new Cube(4);
		Shape3D sphere = new Sphere(3);
		
		// 1. Length of segment
		segment.getPerimeter();
		// 2.Perimeter and Area 
		square.getPerimeter();
		square.getArea();
		circle.getPerimeter();
		circle.getArea();
		cube.getPerimeter();
		cube.getArea();
		System.out.println("The sphere has not perimeter!");
		sphere.getArea();
		// 3. Volume for cube and sphere
		cube.getVolume();
		sphere.getVolume();
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Exception part:");
		
		//next TO DO for check out of bound
		float[] arr = new float[10];
		try {
			System.out.println("Ha Ha: " + arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception thrown in array! Index out of range.");
			//e.printStackTrace();
		}
		
		GenRandomArray generator = new GenRandomArray(100);
		arr = generator.gen(20);
		
		float x;
		try {
			//exception throw from a function
			x = generator.genNo();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Divided by 0!");
			x = 0;
			e.printStackTrace();
		}
		catch (Exception3D e) {
			// TODO Auto-generated catch block
			System.out.println("hjkhhkjg");
			x = 0;
			e.printStackTrace();
		}
		
		//generator.givenWritingStringToFile_whenUsingFileOutputStream_thenCorrect();
		A a = new A(2, "ana are mere");
		try {
			FileOutputStream fileOut = new FileOutputStream("./a.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(a);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved");
		} catch (IOException i) {
			System.out.printf("Serialized data NOT saved");
			i.printStackTrace();
		}
		A a1;
		try {
			FileInputStream fileIn = new FileInputStream("./a.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			a1 = (A) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			System.out.println("Fisier ./a.ser NU a fost gasit");
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Clasa A NU a fost gasita");
			c.printStackTrace();
			return;
		}
		System.out.println("x: " + a.getX());
		System.out.println("y: " + a1.getY());
		
	}

}
