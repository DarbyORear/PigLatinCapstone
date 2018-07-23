package pigLatinCapstone;
import java.util.Scanner;

public class PigLatin {
	
	//Main method:
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String userContinue;
		
		//Use a do-while loop to ask the user for input, translate the word into Pig Latin, and ask if they want to enter another word.
		do {
			translate();

			System.out.println("Would you like to enter another word? (yes/no): ");
	
			userContinue = scnr.next();
			System.out.println();
		}
		
		//set the "while" condition to when the user enters yes.
			while(userContinue.equals("yes") || userContinue.equals("y"));
		
		//If the user doesn't want to continue, thank them for playing.
		System.out.println("Thanks for playing!");
	}

	//Create a method called "translate()" to translate the user's word into Pig Latin:
	public static void translate() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a word: ");
			
		String userWord = scnr.next();
		char firstVowel=0;
		String newWord;
		String newWord2;
		String finalWord;
		
		//Create a for loop to scan the user's word for a vowel. Break after finding the first vowel in the word.
		for(int i=0; i <= userWord.length()-1; i++){
			if (userWord.charAt(i) == 'a' || userWord.charAt(i) == 'e' || userWord.charAt(i) == 'i' || userWord.charAt(i) == 'o' || userWord.charAt(i) == 'u') {
				firstVowel = userWord.charAt(i);
				break;
			} 
		}
		
		//Translate word to Pig Latin.
		userWord.indexOf(firstVowel);
		newWord = userWord.substring(userWord.indexOf(firstVowel), userWord.length());
		newWord2 = userWord.substring(0, userWord.indexOf(firstVowel));
		finalWord = newWord + newWord2 + "ay";
		System.out.println(finalWord);
		System.out.println();
			
	}

}

				
				
	
		


