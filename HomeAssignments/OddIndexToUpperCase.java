package week3.day1.HomeAssignments;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] testChar = test.toCharArray();	//converting  to char array
		int len = testChar.length;

		for (int i = 1; i < len; i++) {

			char A = testChar[i];				//get the character at odd index
			testChar[i] = Character.toUpperCase(A);	//using character to change the char to uppercase.
			i = i + 1;

		}
		System.out.println(testChar);
	}

}
