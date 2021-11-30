/* Nick Krisulevicz
 * Lab 5
 */
import java.util.Scanner;
public class MinOfThree {
	public static void main(String[] args) {
		int firstnum;
		int secondnum;
		int thirdnum;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your first number ");
		firstnum = userInput.nextInt();
		
		System.out.println("Enter your second number ");
		secondnum = userInput.nextInt();
		
		System.out.println("Enter your third number ");
		thirdnum = userInput.nextInt();
		
		if (firstnum<secondnum && firstnum<thirdnum) {
			System.out.println("The smallest number is " + firstnum);
		}
		else if (secondnum<firstnum && secondnum<thirdnum) {
			System.out.println("The smallest number is " + secondnum);
		}
		else {
			System.out.println("The smallest number is " + thirdnum);
		}

	}

}
