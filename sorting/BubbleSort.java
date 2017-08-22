package sorting;

public class BubbleSort {

	//Bubble sort implementation
	public static void bubbleSort(int[] a) {
		int len = a.length - 1;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j + 1] = a[j] + a[j + 1] - (a[j] = a[j + 1]);
				}
			}
		}
	}

	//Print the array
	public static void print(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] bub = { 2, 4, 1, 9, 11, 7, 7, 91, 13, 21, 3 };
		System.out.print("Given Array: ");
		print(bub);
		System.out.println();
		bubbleSort(bub);
		System.out.print("Sorted Array: ");
		print(bub);
	}
}
