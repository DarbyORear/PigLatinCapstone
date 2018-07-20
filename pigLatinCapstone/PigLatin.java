package pigLatinCapstone;
import java.util.Scanner;

public class PigLatin {


	//main method
		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);

			char userWordFirstVowel='a';
			
			switch(userWordFirstVowel) {
				case('a'):
					translate('a');
					break;
				case('e'):
					translate('e');
					break;
				case('i'):
					translate('i');
					break;
				case('o'):
					translate('o');
					break;
				case('u'):
					translate('u');
					break;
				default:
					break;
					}
//			System.out.println("Would you like to enter another word?");
//			String userContinue = scnr.nextLine();
//					
//			if(userContinue.equals("yes") || userContinue.equals("y")) {
//					System.out.println("Great! Let's play again.");
//					} else {
						System.out.println("Thanks for playing!");	
					}
		
					
		public static void translate(char vowel){	
				
				String userWord="";
				String newWord2;
				String finalWord;
				
				Scanner scnr = new Scanner(System.in);
				System.out.println("Welcome to the Pig Latin translator!" + "\n" + "\n"+ "Please enter a word that you would like to translate: ");
				userWord = scnr.nextLine();	

				if(userWord.contains("a") || userWord.contains("e") || userWord.contains("i")) {
						userWord.indexOf(vowel);
						String newWord = userWord.substring(userWord.indexOf(vowel), userWord.length());
//						System.out.println(newWord);
						newWord2 = userWord.substring(0, userWord.indexOf(vowel));
//						System.out.println(newWord + newWord2);
						finalWord = newWord + newWord2 + "ay";
						System.out.println(finalWord);
				}
				else {
					System.out.println("I don't think this is a word in English.");
				}
			scnr.close();
			}
		}

				
				
	
		


