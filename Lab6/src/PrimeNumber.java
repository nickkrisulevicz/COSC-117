//Nick Krisulevicz
//Lab6
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10000: ");
		boolean prime = true;
		int divide;
		int number = input.nextInt();
		for(int i=2;i<=number/2;i++) {
			divide=number%i;
			if(divide==0) {
				prime=false;
				break;
			}
		}
		if(prime=true) {
			System.out.println(number + " is a prime number.");
		}
		else
			System.out.println(number + " is not a prime number.");
		}

}
