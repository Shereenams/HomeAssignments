package week3.day1.HomeAssignments;

public class ReverseOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] test1 = test.split(" ");		//space removed
		int len = test1.length;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0)						//even index
				System.out.print(test1[i] + " ");
			else {
				StringBuilder reverse = new StringBuilder(test1[i]).reverse(); //Reverse method is there in Stringbuilder
				System.out.print(reverse + " ");

			}

		}

	}

}
