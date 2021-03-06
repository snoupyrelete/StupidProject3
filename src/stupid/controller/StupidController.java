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
		System.out.println("My name is " + myName + "\n");
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How is your day?");
		String dayInput = inputReader.nextLine();
		System.out.println("You're having a " + dayInput + " day.\n");
		
		System.out.println("What is the best type of food?");
		String foodInput = inputReader.nextLine();
		System.out.println("You said that " + foodInput + " is the best type of food.\n");
		
		System.out.println("What is your favorite color?");
		String colorInput = inputReader.next();
		System.out.println("You said that " + colorInput + " is your favorite color.\n");
		inputReader.nextLine(); // Ignore unessential potential data
	
		System.out.println("How old are you?");
		int ageInput = inputReader.nextInt();
		System.out.println("You said that you are " + ageInput + " years old.\n");
		inputReader.nextLine();
		
		System.out.println("How hot are you out of 10 as a decimal?");
		float hotnessInput = inputReader.nextFloat();
		if (hotnessInput == 10)
		{
			System.out.println("You're hot!\n");
		} else {
			System.out.println("You're ugly \n");
			inputReader.nextLine();
		}
	
		System.out.println("What are your physical attributes?");
		String physicalInput = inputReader.nextLine();
		System.out.println("You said that you are " + physicalInput + "\n");
	
		System.out.println("What is your favorite activity to do?\n");
		String activityInput = inputReader.nextLine();
		System.out.println("You said that your favorite activity is " + activityInput + "\n");
		
		System.out.println("What size shoe do you wear?");
		float shoeInput = inputReader.nextFloat();
		System.out.println("You said that you wear a shoe size of: " + shoeInput + "\n");
		inputReader.nextLine();
		
		System.out.println("What is your first name?");
		String nameInput = inputReader.next();
		System.out.println("Your name is: " + nameInput + "\n");
		inputReader.nextLine();
		
		System.out.println("What is the best brand of car?");
		String carInput = inputReader.nextLine();
		System.out.println("You said that " + carInput + " is the best type of car.\n");
	}
}
