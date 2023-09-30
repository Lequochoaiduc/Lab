package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {

		this.array = array;
	}

	// task1.1
	public int[] mirror() {
		int[] result = new int[this.array.length * 2];
		int mirrorIndex = result.length - 1;
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[mirrorIndex--] = array[i];
		}
		return result;

	}

	/*
	 * Task1.1
	 * 
	 */
	public int[] removeDulicates() {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int num : array) {
			if (!set.contains(num)) {
				set.add(num);
				list.add(num);
			}
		}
		int[] newArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newArray[i] = list.get(i);
		}
		return newArray;
	}

	// task1.2
	public int[] getMissingValues() {
		HashSet<Integer> set = new HashSet<>(); // Tạo một HashSet để lưu trữ các phần tử trong mảng
		for (int num : array) {// Duyệt qua mảng và thêm vào set
			set.add(num);
		}
		ArrayList<Integer> list = new ArrayList<>();// Tạo một ArrayList để lưu trữ các số thiếu sót
		for (int i = 1; i <= array.length; i++) {// Duyệt qua các số từ 1 đến n (n là số lượng phần tử trong mảng)
			if (!set.contains(i)) { // Nếu số đó không có trong set
				list.add(i); // Thêm vào list
			}
		}
		int[] newArray = new int[list.size()];// Tạo một mảng mới có kích thước bằng với list
		for (int i = 0; i < list.size(); i++) {// Chuyển các phần tử từ list sang mảng mới
			newArray[i] = list.get(i);
		}
		return newArray;// Trả về mảng mới

	}

	public static void main(String[] args) {
//	        int[] array = {1, 2, 3};
//	        MyArray ma = new MyArray(array);
//	
//	        int[] mirror = ma.mirror();
//	        System.out.println(Arrays.toString(ma.mirror()));

		// removeDuplicates
//	        int[] array = {1, 3, 5, 1, 3 ,7 ,9 ,8};
//	        Arrays.sort(array);
//	        MyArray ma =new MyArray(array);
//	        int[]noDup = ma.removeDulicates();
//	        System.out.println(Arrays.toString(noDup));
//
//	      
		//getMissingValues
//			int[] array = {10, 11 ,12, 13, 14, 16, 17, 19 ,20};
//			MyArray ma = new MyArray(array);
//			int [] missing = ma.getMissingValues();
//			System.out.println(Arrays.toString(missing));

	}
}
