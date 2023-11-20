package BasicProblems;

public class task1_4 {
	public static void moveTower(int disk, char sourse, char dest, char square) {
		if (disk == 1) {
			System.out.println("Take disk 1 from " + sourse + " to " + dest);
			return;
		}else {
		moveTower(disk - 1, sourse, square, dest);
		System.out.println("Take disk " + disk + " from " + sourse + " to " + dest);
		moveTower(disk - 1, sourse, square, dest);
		}
	}

	public static void main(String[] args) {
		int disk = 3;
		moveTower(disk, 'A', 'C', 'B');
	}
}
