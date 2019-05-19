package adapter;

public class BirdAdapter implements ToyDuck 
{

	public BirdAdapter() 
	{
		// TODO Auto-generated constructor stub
	}
	// You need to implement the interface your
	// client expects to use.
	// this class should be used instead of ToyDuck. This class will adapt ToyDuck to Bird
	
	Bird bird;
	
	public BirdAdapter(Bird bird)
	{
		// we need reference to the object we
		// are adapting
		this.bird = bird;
	}
	public void squeak()
	{
		// translate the methods appropriately
		bird.makeSound();
		bird.fly(); // you can call also sparrow.makeSound(), there are no restriction on this. Only on logical level
	}
}
