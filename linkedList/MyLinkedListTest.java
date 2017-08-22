package linkedList;

import java.util.Iterator;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList<Integer> list=new MyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.addFirst(50);
		list.addLast(70);
		System.out.println("Size of Linkedlist"+list.size());
		System.out.println("Removed element 30 : "+list.remove((Integer)30));
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Index of element: "+list.indexOf(30));
		System.out.println("Element at 4th positon: "+list.get(3));
		System.out.println("list Contains 30: "+list.contains(30));
	}

}
