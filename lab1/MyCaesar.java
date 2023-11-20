package Lab1;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	public char encryptChar(char c) {
		int index = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == c) {
				index = i;
			}
		}
		if ((n + index) > 26) {
			return ALPHABET[(n + index) - 26];
		}
		return ALPHABET[n + index];
	}

	public String encrypt(String input) {
		String result = "";
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			result += encryptChar(ch[i]);
		}
		return result;
	}

	public char decryptChar(char c) {
		int index = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == c) {
				index = i;
			}
		}
		if (index - n  < 0) {
			return ALPHABET[(index - n) + 26];
		}
		return ALPHABET[index - n];
	}

	public String decrypt(String input) {
		String result = "";
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			result += decryptChar(ch[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		MyCaesar mc = new MyCaesar(3);
//		System.out.println(mc.encrypt("HOAIDUC"));
		System.out.println(mc.decrypt("ABCDEF"));
	}
}
