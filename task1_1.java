package BasicProblems;

public class task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if (n == 0) {
			return 0;
		}
		return n * (int) Math.pow(-1, n + 1) + getSn1(n - 1);
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		if (n == 0) {
			return 0;
		}
		return Factorial(n) + getSn2(n - 1);
	}

	private static int Factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * Factorial(n - 1);
	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 0) {
			return 0;
		}
		return n * n + getSn3(n - 1);
	}

	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		if (n==0) {
			return 1;
		}
		return 1/Factorial(2*n)+getSn4(n-1);// The method was in the previous sentence
	}

	public static void main(String[] args) {
		int sum = getSn1(4);
		System.out.println("GetSn1 la: " + sum);
		int sum2 = getSn2(4);
		System.out.println("GetSn2 la: " + sum2);
		int sum3 = getSn3(3);
		System.out.println("GetSn3 la: " + sum3);
		int sum4 = (int) getSn4(4);
		System.out.println("GetSn4 la: " + sum4);
	}
}
