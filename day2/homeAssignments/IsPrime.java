package week1.day2.homeAssignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 21;
		String answer; //Variable for the result
		if (num <= 1)
			answer = "Not a Prime"; //To check 1 and negative numbers
		else {
			answer = "Prime"; // First condition for greater than  numbers

			for (int i = 2; i < num; i++) {		//Prime number checks
				if (num % i == 0) {
					answer = "Not a prime";
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
