package week3.day1.HomeAssignments;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] word = text.split(" ");		//space removed and stored 
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {   //to check each word
				if (word[i].equals(word[j])) {
					word[i] = "";
					word[j] = "";
				}

			}
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + " ");
		}

	}

}
