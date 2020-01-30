import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		int maximum = ascendingFunction();

	}

	public static int ascendingFunction() {

		Scanner input = new Scanner(System.in);

		// Taking input from user to create a array memory

		System.out.println("Enter the total Number you want to enter:-");
		int totalNum = input.nextInt();

		// Taking inputs values to store in Array

		System.out.println("Enter the numbers:-");

		int[] elementArray = new int[totalNum];

		for (int i = 0; i < totalNum; i++) {

			elementArray[i] = input.nextInt();
		}

		System.out.println("Your inputs are:-");
		for (int i = 0; i < elementArray.length; i++) {
			System.out.print(" " + elementArray[i]);
		}

		int temp;
		for (int i = 0; i < elementArray.length; i++) {

			for (int j = i + 1; j < elementArray.length; j++) {

				if (elementArray[i] > elementArray[j]) {

					// Swapping the value from largest to lowest

					temp = elementArray[i];
					elementArray[i] = elementArray[j];
					elementArray[j] = temp;

				}
			}

		}
		System.out.println("\nAfter Arrange lowest to highest are:-");
		for (int i = 0; i < elementArray.length; i++) {

			// Showing the output to user lowest to highest

			System.out.print(" " + elementArray[i]);
		}
		return 0;

	}

}
