package sorting;

public class NonRecursiveQuickSort {
	// Partition the array in two half.
	public static int partition(int arr[], int lo, int hi) {
		int p = arr[hi];
		int i = lo - 1;
		for (int j = lo; j <= hi - 1; j++) {
			if (arr[j] <= p) {
				i++;
				arr[j] = arr[i] + arr[j] - (arr[i] = arr[j]); // swap
			}
		}
		arr[hi] = arr[i + 1] + arr[hi] - (arr[i + 1] = arr[hi]); // swap
		return (i + 1);
	}

	// print the array element.
	public static void print(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	// QuickSort implementation
	public static void quickSort(int[] a, int low, int high) {

		int stack[] = new int[high - low + 1]; // create auxiliary stack
		int top = -1;
		stack[++top] = low;
		stack[++top] = high;
		while (top >= 0) {
			high = stack[top--];
			low = stack[top--];
			int p = partition(a, low, high);
			if (p - 1 > low) {
				stack[++top] = low;
				stack[++top] = p - 1;
			}
			if (p + 1 < high) {
				stack[++top] = p + 1;
				stack[++top] = high;
			}
		}
	}

	public static void main(String[] args) {
		int[] quick = { 2, 4, 1, 9, 11, 7, 7, 91, 13, 21, 3 };
		int low = 0, high = quick.length - 1;
		quickSort(quick, low, high);
		for (int n : quick) {
			System.out.print(n + " ");
		}
	}
}
