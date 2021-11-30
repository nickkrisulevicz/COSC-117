//Nick Krisulevucz
//Lab7
import java.util.Scanner;
public class IsPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string1 = "";
		String string2 = "";
		System.out.println("Enter a word to see if it is a palidrome: ");
		string1 = input.nextLine();
		int len = string1.length();
		for (int i = len -1; i > 0; i--) {
			string2 = string2 + string1.charAt(i);
		}
		if (string1==string2) {
			System.out.println(string1 + " is a palindrome.");
		}
		else {
			System.out.println(string1 + " is not a palindrome.");
		}			
	}
}
