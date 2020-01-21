import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		int primeNum = primeFunction();

		if (primeNum == 0) {

			System.out.println(" It's a prime No");
		} else {

			System.out.println(" It's not a prime No");
		}

	}

	public static int primeFunction() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Any no to check its prime :-");

		int inputNum = input.nextInt();

		int temp = 0;

		for (int i = 2; i <= inputNum - 1; i++) {

			if (inputNum % i == 0) {

				temp = temp + 1;
			}
		}

		return temp;

	}
}
