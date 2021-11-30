import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int bills;
		int quarters;
		int pricepennies;
	
		System.out.println("Enter bill value: ");
		bills = keyboard.nextInt();
		
		System.out.println("Enter number of quarters: ");
		quarters = keyboard.nextInt();
		
		System.out.println("Enter the item price in pennies: ");
		pricepennies = keyboard.nextInt();
		
		int amount = bills*100 + quarters*25;
		
		System.out.println("You entered " + amount + " pennies");
		
		int billchange = (amount-pricepennies)/100;
		int quarterchange = (amount-pricepennies)/25;
		
		System.out.println("Your change in dollar bills is " + billchange);
		System.out.println("Your change in quarters is " + quarterchange);
	}
}
