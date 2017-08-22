package array;

import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(3);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Current Size "+list.size());
		list.add(40);
		System.out.println("New Size of Arraylist"+list.size());
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Index of element: "+list.indexOf(30));
		System.out.println("Element at 4th positon: "+list.get(3));
		System.out.println("list Contains 30: "+list.contains(30));
		
	}
}
