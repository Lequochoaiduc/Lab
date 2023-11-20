package Advamce;

public class task2 {
//	This method takes as an input 
//	one integer value n and then output on console a pyramid 
//	as on figure below for example for n=4: 
	// X
	// XXX
	// XXXXX
	// XXXXXXX

	public static void drawPyramid(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {// can giua
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	// Pyramid Pattern_1
	public static void drawPyramid_1(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			int x = 1;
			for (int k = 0; k < i; k++) {
				x = i;
				System.out.print(x + " ");

			}

			System.out.println();
		}
	}

	// Pyramid Pattern_2
	public static void drawPyramid_2(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			int x = 1;
			for (int k = 0; k < i; k++) {

				System.out.print(x + " ");
				x++;
			}

			System.out.println();
		}
	}

	// Pyramid Pattern_3
	public static void drawPyramid_3(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			int x = 1;
			for (int k = 0; k < i; k++) {

				System.out.print("* ");

			}

			System.out.println();
		}
	}

	// Pyramid Pattern_4
	public static void drawPyramid_4(int n) {
		int x = 0;
		int output = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= 2 * n; j++) {
				x = j - n;
				if (x < 0) {
					x *= -1;
				}
				output = i - x;
				if (output > 0) {
					System.out.printf("%3d", output);
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		drawPyramid(4);
		System.out.println("Pyramid-1----------------");
		drawPyramid_1(9);
		System.out.println("Pyramid-2----------------");
		drawPyramid_2(9);
		System.out.println("Pyramid-3----------------");
		drawPyramid_3(9);
		System.out.println("Pyramid-4----------------");
		drawPyramid_4(9);

	}
}
