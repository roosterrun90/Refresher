import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class MathsTest{

	public static void main(String [] args){

		//Class Variables

		//Take Users name & Maths Choice
		//Username
		Scanner usernameInput = new Scanner(System.in);
		System.out.println("Please neter your name...");
		String userName = usernameInput.nextLine();
		//Choice
		Scanner userMathsInput = new Scanner(System.in);
		System.out.println("Welcome " + userName + ". Which test would you like to take?");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		String userMathsChoice = userMathsInput.nextLine();



		switch(userMathsChoice){
			case "Addition":
				//Generate 2 random numbers, add them together and store the answer
				Random randA = new Random();
				Random randB = new Random();
				int a = randA.nextInt(100) + 1;
				int b = randB.nextInt(100) + 1;
				int answer = a + b;

				int userAnswer = 0;
				System.out.println(a + " + " + b);
				System.out.println("Think you know the answer?");
				
					while(userAnswer != answer){

						System.out.println("Incorrect, Try again...");

						//Take user input (answer)
						Scanner userAnswerInput = new Scanner(System.in);
						System.out.println("Enter your answer...");
						userAnswer = userAnswerInput.nextInt();

					}
						System.out.println("Correct!");
			break;
			case "Subtraction":

			break;
			case "Multiplication":

			break;
			case "Division":

			break;
		}

	}

}

