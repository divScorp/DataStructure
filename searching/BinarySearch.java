package searching;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] a, int num,int l,int r) {
		int mid=((l+r)/2);
		if(l<=r) {
			if(a[mid]==num)
				return mid;
			if(a[mid]>=num)
				return binarySearch(a, num, l, mid-1);
						
			return binarySearch(a, num, mid+1, r);
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= {11,3,7,2,9,10,9,14,18};
		System.out.print("Enter the number for Searching: ");
		int n=sc.nextInt();
		int leftIndex=0;
		int rightIndex=a.length-1;
		int index=binarySearch(a,n,leftIndex,rightIndex);
		if(index==-1) {
			System.out.println("Not Found !!");
		}else {
			System.out.println("Your no. located at: "+(index+1)+" position");
		}
		sc.close();
	}
}
