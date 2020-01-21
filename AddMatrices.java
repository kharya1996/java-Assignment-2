

public class AddMatrices {

	public static void main(String[] args) {

		int matrixB[][] = { { 2, 3, 4 }, { 1, 2, 3 }, { 4, 5, 6 } };
		int matrixA[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 2, 3, 4 } };
		int result[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				result[i][j] = matrixA[i][j] + matrixB[i][j];
				System.out.print(result[i][j] + " ");
			}

			System.out.println();
		}

	}

}
