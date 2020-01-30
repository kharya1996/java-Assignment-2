import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {

		// calling the duplicateFunction

		int duplicate = duplicateFunction();
	}

	public static int duplicateFunction() {

		Scanner input = new Scanner(System.in);

		// Taking inputs values to store in Array

		System.out.println("Enter how many input you want to enter");
		int totalElement = input.nextInt();
		int[] elementArray = new int[totalElement];

		System.out.println("Enter the numbers to check Duplicates");

		for (int i = 0; i < totalElement; i++) {

			elementArray[i] = input.nextInt();
		}
		System.out.println("The Duplicate Numbers are:-");
		for (int i = 0; i < elementArray.length; i++) {

			// Comparing the value in I and J to find duplicate value

			for (int j = i + 1; j < elementArray.length; j++) {

				if (elementArray[i] == elementArray[j]) {
					
					//Showing the duplicate value to user

					System.out.print(elementArray[j] + " ");

				}
			}
		}

		return 0;

	}

}
