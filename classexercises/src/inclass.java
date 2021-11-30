
import java.util.Scanner;
public class Myarray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] monkey = new int[8];
		System.out.println("Enter int values for the array: ");
		for (int i=0; i<monkey.length; i++) {
			monkey[i] = input.nextInt();
		}
		for (int i=0; i<monkey.length; i++) {
			System.out.println("monkey[" + monkey + "]: " + monkey[i]);
		}
	}
}
