package temp;
import java.util.Scanner;
public class SearchLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] mystring = new String[64];
		char letter;
		int total=0;
		System.out.println("Enter a sentence no more than 64 characters: ");
		for (int i=0; i<mystring.length; i++) {
			mystring[i] = input.nextLine();
		}
		System.out.println("Enter a letter to search for within the sentence: ");
		letter = input.next();
		for (int i=0; i<mystring.length; i++) {
			if (mystring[i]=letter) {
				total=total+1;
			}
		}
		System.out.println(mystring);
		System.out.println("There are " + total + " of letter " + letter + " in this sentence.");
	}
}
