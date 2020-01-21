import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		int sum = arraySumFunction();

	}

	public static int arraySumFunction() {

		Scanner input = new Scanner(System.in);

		// Taking input from user to create a array memory

		System.out.println("Enter how many input you want to enter");
		int totalElement = input.nextInt();
		int[] elementArray = new int[totalElement];

		// Taking inputs values to store in Array

		System.out.println("Enter the values for Addition");

		for (int i = 0; i < totalElement; i++) {

			elementArray[i] = input.nextInt();
		}

		int totalSum = 0;

		// calculating the sum of Array

		for (int i = 0; i < elementArray.length; i++) {

			totalSum = totalSum + elementArray[i];
		}

		// Showing total sum of Array as Result

		System.out.println("The total sum of values are:- " + totalSum);

		return 0;

	}

}
