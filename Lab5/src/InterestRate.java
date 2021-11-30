/* Nick Krisulevicz
 * Lab 5
 */
import java.util.Scanner;
public class InterestRate {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		float interestrate;
		
		System.out.println("Enter the time left on the payment ");
		interestrate = userinput.nextFloat();
		
		if (interestrate >= 5) {
			System.out.println("Your interest rate is 0.0475");
		}
		else if (interestrate >= 4) {
			System.out.println("Your interest rate is 0.045");
		}
		else if (interestrate >= 3) {
			System.out.println("Your interest rate is 0.040");
		}
		else if (interestrate >= 2) {
			System.out.println("Your interest rate is 0.035");
		}
		else if (interestrate >= 1) {
			System.out.println("Your interest rate is 0.030");
		}
		else {
			System.out.println("Your interest rate is 0.025");
		}
	}
}
