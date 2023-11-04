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

	//Method mirror that outputs the contents of an array in a 
//reverse order like a mirror 
//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int result[] = new int[this.array.length * 2];

		int tmp = 0;
		for (int i = 0; i < result.length; i++) {
			if (i > array.length - 1) {
				result[i] = array[array.length - tmp - 1];
				tmp++;
			} else {
				result[i] = array[i];
			}

		}
		return result;
	}

	// removes all duplicate elements from an array and returns a
	// new array
	// Input: 1 3 5 1 3 7 9 8
	// Output: 1 3 5 7 9 8
	public int[] removeDuplicates() {
		int tempArray[] = new int[array.length];
		int count = 0;
		for (int element : array) {
			if (!isDuplicate(tempArray, element)) {
				tempArray[count] = element;
				count++;
			}

		}
		int result[] = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = tempArray[i];
		}

		return result;
	}

	private boolean isDuplicate(int[] array, int element) {
		for (int value : array) {
			if (value == element) {
				return true;
			}
		}

		return false;
	}

	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public int[] getMissingValues() {
		int count = 0;
		int i = 0;
		int j = 1;
		while (i < array.length - 1 && j < array.length) {
			if (array[j] - array[i] == 2) {
				count++;
			}
			i++;
			j++;
		}
		i = 0;
		j = 1;
		int tempArray[] = new int[count];
		count = 0;
		while (count < tempArray.length && i < array.length - 1 && j < array.length) {
			if (array[j] - array[i] == 2) {
				tempArray[count] = array[i] + 1;
				count++;
			}
			i++;
			j++;
		}

		return tempArray;

	}

	// Input: 10 11 12 -1 14 10 17 19 20
	// Output(k=3): 10 11 12 12 14 16 17 19 20

	public int[] fillMissingValues(int k) {
		
		return array;
		
		
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3 };
//		MyArray ma = new MyArray(arr);
//		System.out.println(Arrays.toString(ma.mirror()));
//
//		int arr1[] = { 1, 3, 5, 1, 3, 7, 9, 8 };
//		MyArray ma1 = new MyArray(arr1);
//		System.out.println(Arrays.toString(ma1.removeDuplicates()));

		int arr2[] = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		MyArray ma2 = new MyArray(arr2);
		System.out.println(Arrays.toString(ma2.getMissingValues()));
		
		int arr3[] =  {10,11,12,-1,14,10,17,19,20};
		MyArray ma3 = new MyArray(arr3);
		System.out.println(Arrays.toString(ma3.fillMissingValues(3)));
	}
}
