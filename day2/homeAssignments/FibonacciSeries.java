package week1.day2.homeAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int num1 = 0; // first number of the series
		int num2 = 1; // Second number of the Series
		for (int i = 0; i < range; i++) { // For loop to reach the range
			int num = num1 + num2; // Fibonacci action
			System.out.print(num1 + " ");
			num1 = num2;
			num2 = num;
		}

	}

}
