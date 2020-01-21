import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		int maximum = maxFunction();

		// Showing the output to user Second largest value

		System.out.println("\nSecond largest number is:-" + maximum);

	}

	public static int maxFunction() {

		Scanner input = new Scanner(System.in);

		// Taking input from user to create a array memory

		System.out.println("Enter the total Number you want to enter:-");
		int totalNum = input.nextInt();

		// Taking inputs values to store in Array

		System.out.println("Enter the numbers:-");

		int[] elementArray = new int[totalNum];

		for (int i = 0; i < totalNum; i++) {

			// Storing the values in Array

			elementArray[i] = input.nextInt();
		}
		// Showing user inputs

		System.out.println("Your inputs are:-");
		for (int i = 0; i < elementArray.length; i++) {
			System.out.print(" " + elementArray[i]);
		}

		int secondLargest;
		for (int i = 0; i < elementArray.length; i++) {

			for (int j = i + 1; j < elementArray.length; j++) {

				if (elementArray[i] < elementArray[j]) {

					// Swapping the value from largest to lowest

					secondLargest = elementArray[i];
					elementArray[i] = elementArray[j];
					elementArray[j] = secondLargest;

				}
			}

		}
		System.out.println("\nAfter Arrange highest to lowest are:-");
		for (int i = 0; i < elementArray.length; i++) {
			System.out.print(" " + elementArray[i]);
		}

		return elementArray[1];

	}

}
