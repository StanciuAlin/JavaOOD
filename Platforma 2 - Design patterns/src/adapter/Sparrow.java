package adapter;

public class Sparrow implements Bird 
{

	public Sparrow() 
	{
		// TODO Auto-generated constructor stub
	}

	// a concrete implementation of bird
	public void fly()
	{
		System.out.println("Bird Flying");
	}
	public void makeSound()
	{
		System.out.println("Bird Chirp Chirp");
	}

}
