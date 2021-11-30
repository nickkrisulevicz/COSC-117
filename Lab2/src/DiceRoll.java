/**
  * Nick Krisulevicz
  * Lab 2
  * 02/07/2020
  * This program will generate a random number from 1-6 to simulate a die rolling
  */
public class DiceRoll {
	public static void main(String[] args) {
		int x1 = (int)(Math.random()*6)+1;
		System.out.println("Your first die comes up " + x1);
		int x2 = (int)(Math.random()*6)+1;
		System.out.println("Your second die die comes up " + x2);
		int x3 = x1 + x2;
		System.out.println("Your total roll is " + x3);
	}
}
