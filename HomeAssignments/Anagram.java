package week3.day1.HomeAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] textchar1 = text1.toCharArray();// converting them to charArray
			char[] textchar2 = text2.toCharArray();
			Arrays.sort(textchar1); // sorting the charArray and storing it in the same variable
			Arrays.sort(textchar2);

			if (Arrays.equals(textchar1, textchar2)) {
				System.out.println("The given strings are Anagram");
			}

			else {
				System.out.println("The given strings are not Anagram");

			}

		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}
