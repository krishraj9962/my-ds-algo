package ds.alg.array;

import java.util.Arrays;

public class SimilarElelements {

	static Long getSimilarElement(Object[] array, Integer N) {
		Arrays.sort(array);
		System.out.println("Input element is:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		return null;
	}

	public static void main(String[] args) {

		Integer[] inputArray = { 3, 1, 5, 7, 8, 2, 4, 7 };
		System.out.println("Input element is:");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ", ");
		}
		getSimilarElement(inputArray, inputArray.length);
	}

}
