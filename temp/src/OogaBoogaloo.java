import java.util.Scanner;
public class OogaBoogaloo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] y = new double [2];
		System.out.println("Enter a first number: ");
		y[0] = input.nextDouble();
		System.out.println("Enter a second number: ");
		y[1] = input.nextDouble();
		swap(y);
		System.out.println("Y[0] = " + y[0] + " Y[1] = " + y[1]);
	}
	
	public static void swap (double[] x) {
		double temp = x[0];
		x[0]=x[1];
		x[1]=temp;
		System.out.println("X[0] = " + x[0] + " X[1] = " + x[1]);
	}
}
