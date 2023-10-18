package BasicProblems;

public class task1_3 {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	// This method is used to display a Pascal triangle based on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriagle(int row) {
		for (int i = 0; i < row; i++) {
			// In ra các khoảng trắng trước mỗi hàng
			for (int j = 0; j < row - i - 1; j++) {
				System.out.print(" ");
			}
			// In ra các phần tử trong hàng
			for (int k = 0; k <= i; k++) {
				// Tính bằng công thức nCr
				int coeff = factorial(i) / (factorial(i - k) * factorial(k));
				System.out.print(coeff + " ");
			}
			System.out.println();
		}
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		return null;
		

	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		return prevRow;

	}
	public static void main(String[] args) {
		int row = 5;
		printPascalTriagle(row);
		System.out.println("________________");

	}
}
