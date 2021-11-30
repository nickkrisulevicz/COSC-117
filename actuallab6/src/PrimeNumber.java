import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10000 ");
		boolean prime = true;
		int checker;
		int number = stdin.nextInt();
		for(int i=2;i<=number/2;i++) {
			checker=number%i;
			if(checker==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println(number + " is a prime number.");
		}
		else
			System.out.println(number + " is not a prime number.");
		}

}
