import java.util.Scanner;

public class CountVowelAndConsonat {

	public static void main(String[] args) {

		String vowelANDconsonant = vowelORconsonant();
	}

	public static String vowelORconsonant() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the String:-");
		char[] inputString = input.nextLine().toCharArray();

		int countVowel = 0, countConsonant = 0;

		for (int i = 0; i < inputString.length; i++) {

			if (inputString[i] == 'a' || inputString[i] == 'A' || inputString[i] == 'e' || inputString[i] == 'E'
					|| inputString[i] == 'i' || inputString[i] == 'I' || inputString[i] == 'o' || inputString[i] == 'O'
					|| inputString[i] == 'u' || inputString[i] == 'U') {

				countVowel++;
			}

			else if (inputString[i] >= 'a' && inputString[i] <= 'z' || inputString[i] >= 'A' && inputString[i] >= 'Z') {

				countConsonant++;

			}
		}

		System.out.println("Totalvowel are:- " + countVowel);
		System.out.println("Total Consonant are :- " + countConsonant);

		return null;

	}

}
