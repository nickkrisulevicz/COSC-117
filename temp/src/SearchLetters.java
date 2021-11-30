//Nick Krisulevicz
//Lab7
import java.util.Scanner;
public class SearchLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mystring = new String();
		int [] characters = new int[64];
		int len = mystring.length();
		char letter = ' ';
		int total=0;
		System.out.println("Enter a sentence no more than 64 characters: ");
		mystring = input.nextLine();
		System.out.println("Enter a letter to search for within the sentence: ");
		letter = input.next().charAt(0);
		for (int i=0; i<len; i++) {
			characters[i]=mystring.charAt(i);
			if (characters[i]==letter) {
				total=total+1;
			}
		}
		System.out.println(mystring);
		System.out.println("There are " + total + " of letter " + letter + " in this sentence.");
	}
}
