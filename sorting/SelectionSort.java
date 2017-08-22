package sorting;

public class SelectionSort {

	//Bubble sort implementation
	public static void selectionSort(int[] a, int l) {
		int minindex;
		for (int i = 0; i < l - 1; i++) {
			minindex = i;
			for (int j = i + 1; j < l; j++) { // To find minimum Number
				if (a[j] < a[minindex])
					minindex = j;
			}
			a[minindex] = a[i] + a[minindex] - (a[i] = a[minindex]);// Swap
		}
	}

	//print the array element.
	public static void print(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] slection = { 2, 4, 1, 9, 11, 7, 7, 91, 13, 21, 3 };
		System.out.print("Given Array: ");
		print(slection);
		System.out.println();
		selectionSort(slection, slection.length);
		System.out.print("Sorted Array: ");
		print(slection);
	}

}
