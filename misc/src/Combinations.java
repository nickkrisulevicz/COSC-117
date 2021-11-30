//Nick Krisulevicz
//Lab8
import java.util.Scanner;
public class Combinations {
	public static int factorial (int x) {
		int fact = 1;
		for (int i = 2; i <= x; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static int combinations (int x, int y) {
		int combo1 = factorial(x);
		int combo2 = factorial(y);
		int combo3 = factorial(x-y);
		return combo1/(combo2*combo3);
	}	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total amount of choices possible. ");
		int num1 = input.nextInt();
		System.out.println("Enter a number of choices the user gets. ");
		int num2 = input.nextInt();
		int combos = combinations(num1, num2);
		System.out.println("Total combinations in this scenario: " + combos);
	}	
}
