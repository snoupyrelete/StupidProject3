package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private Scanner inputReader; // Data members
	private String myName;

	public StupidController() // Constructor
	{
		myName = "Chicka, chicka, Slim Shady"; // Initializes Data members
		inputReader = new Scanner(System.in);
	}

	public void start() // Methods
	{
		System.out.println("This program is slightly less stupid.");
		System.out.println("My name is " + myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How is your day?");
		String input = inputReader.nextLine();
		System.out.println("You're having a " + input + " day.");
	}
}
