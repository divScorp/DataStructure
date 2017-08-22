package array;

/*
 
   Write a program to implement your own ArrayList class. 
    It should contain add(), get(), remove(), size() methods. 
    Use dynamic array logic. It should increase its size when it reaches threshold. 
*/
import java.util.Arrays;

public class MyArrayList {

	private Object[] myStore;
	private int actSize = 0;

	public MyArrayList() {
		myStore = new Object[10];
	}

	public Object get(int index) {
		if (index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (myStore.length - actSize <= 5) {
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}

	public Object remove(int index) {
		if (index < actSize) {
			Object obj = myStore[index];
			myStore[index] = null;
			int tmp = index;
			while (tmp < actSize) {
				myStore[tmp] = myStore[tmp + 1];
				myStore[tmp + 1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return actSize;
	}

	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\nNew length: " + myStore.length);
	}

	public static void main(String a[]) {
		MyArrayList mal = new MyArrayList();
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
		mal.add(new Integer(29));
		System.out.println("Element at Index 5:" + mal.get(5));
		System.out.println("List size: " + mal.size());
		System.out.println("Removing element at index 2: " + mal.remove(2));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
	}
}
