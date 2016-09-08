package stupid.controller;

public class StupidController
{
	private String myName;

	public StupidController() // Constructor
	{
		myName = "Dylan Robson"; // Initializes a string
	}

	public void start()
	{
		System.out.println("This program is slightly less stupid.");
		System.out.println("My name is " + myName);
	}
}
