//Nick Krisulevicz
//Lab 6
import java.util.Scanner;
public class SimpleStats {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int input=0;
		int max1=0;
		int max2=0;
		int min1=0;
		int min2=0;
		int avg=0;
		int total=0;
		int count=0;
		System.out.println("Enter a sequence of nonnegative numbers followed by -1: ");
		input=stdin.nextInt();
		while(input != -1) {
			input=max1;
			input=min1;
			if(input>max1) {
				max1=max2;
			}
			if(input<min1) {
				min1=min2;
			}
			total=total+input;
			count=count+1;
			input=stdin.nextInt();
		}
		avg=total/count;
		System.out.println("Minimum value is: " + min2);
		System.out.println("Maximum value is: " + max2);
		System.out.println("Average value is: " + avg);
	}
}