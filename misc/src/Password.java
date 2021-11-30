//Nick Krisulevicz
//Project 1
import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		boolean functional = true;
		int works = 0;
		boolean valid = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Your password must be at least eight characters, and contain one capital, one lowercase, and one number. ");
		System.out.println("Enter new password: ");
		String password = input.nextLine();
		System.out.println("Confirm new password: ");
		String confirm = input.nextLine();
		if (password.equals(confirm)) {
			functional = true;
		}
		else {
			System.out.println("Passwords do not match. ");
			functional = false;
		}
		if(wordlength(password) == true) {
			works = works + 1;
		}
		if (caps(password) == true) {
			works = works + 1;
		}
		if (lowers(password) == true) {
			works = works + 1;
		}
		if (numbers(password) == true) {
			works = works + 1;
		}
		if (works == 4) {
			valid = true;
		}
		if (valid == true) {
			System.out.println("Congratulations! Your new password has been accepted. ");
		}
		else {
			System.out.println("Your password does not meet all requirements. Enter a new one. ");
		}
	}
//-----------------------------------------
	public static boolean numbers (String x) {
		boolean hasnumbers = false;
		int len = x.length();
		for (int i = 0; i < len; i++) {
			char l = x.charAt(i);
			if (l >= '0' && l <= '9') {
				hasnumbers = true;
			}
		}
		return hasnumbers;
	}
//-----------------------------------------
	public static boolean lowers (String x) {
		boolean haslowers = false;
		int len = x.length();
		for (int i = 0; i < len; i++) {
			char m = x.charAt(i);
			if (m >= 'a' && m <= 'z') {
				haslowers = true;
			}
		}
		return haslowers;
	}
//-----------------------------------------
	public static boolean caps (String x) {
		int len = x.length();
		boolean hascaps = false;
		for (int i = 0; i < len ; i++) {
			char n = x.charAt(i);
			if (n >= 'A' && n <= 'Z' ) {
				hascaps = true;
			}
		}
		return hascaps;
	}
//-----------------------------------------
	public static boolean wordlength (String x) {
		int len = x.length();
		boolean isgood = false;
		if (len >= 8) {
			isgood = true;
		}
		return isgood;
	}
//-----------------------------------------
}
