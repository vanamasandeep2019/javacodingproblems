package arrays;

public class SortedArray {
	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 50};
		System.out.println(isSorted(array));

	}

	private static boolean isSorted(int[] array) {

		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[i])
					return false;
		return true;
	}

}
