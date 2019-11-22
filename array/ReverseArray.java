import java.util.Scanner;
//program to reverse an array in java
public class ReverseArray
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i =0 ;i < n; i++)
		{
			arr[i] = s.nextInt();
		}
		int temp;
		for(int i = 0, j = n-1; i < n/2; i++, j--) //swapping the elements from begining with elements starting from end
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println("Reversed array : ");
		for(int i =0 ;i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}