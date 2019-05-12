package adapter;

public interface Bird 
{
	// define Bird behavior by some methods
	// birds implement Bird interface that allows
	// them to fly and make sounds adaptee interface
	public void fly();
	public void makeSound(); // I want this method
	// to be called to replace/adapt the squeak method from ToyDuck
}
