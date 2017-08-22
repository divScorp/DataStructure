package sorting;

public class InsertionSort {

	// insertion sort algorithm implementation
	public static void insertionSort(int[] a) {
		int key, i, j;
		int len = a.length;
		for (i = 1; i < len; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j=j-1;
			}
			a[j + 1] = key;
		}
	}

	// print the array element.
	public static void print(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] insert = { 2, 4, 1, 9, 11, 7, 7, 91, 13, 21, 3 };
		System.out.print("Given Array: ");
		print(insert);
		System.out.println();
		insertionSort(insert);
		System.out.print("Sorted Array: ");
		print(insert);
	}
}
