package adapter;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Sparrow sparrow = new Sparrow(); // implementation and instance of a Bird
		ToyDuck toyDuck = new PlasticToyDuck(); // implementation and instance of a ToyDuck
		// Wrap a bird in a birdAdapter so that it
		// behaves like toy duck
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		
		// original squeak
		System.out.println("\nToyDuck...\n");
		toyDuck.squeak();
		
		// original methods from Bird/Sparrow
		System.out.println("\nSparrow...\n");
		sparrow.fly();
		sparrow.makeSound();
		
		// toy duck behaving like a bird
		System.out.println("\nBirdAdapter...\n");
		birdAdapter.squeak();
	}

}
