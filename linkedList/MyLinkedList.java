package linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {

	private class Node {
		E data;
		Node next;

		Node(E e) {
			data = e;
		}
	}

	private Node first;
	private Node last;
	private int count;

	public boolean add(E element) {
		add(count, element);
		return true;
	}

	private void create(E element) {
		first = new Node(element);
		last = first;
		count++;
	}

	public void add(int index, E element) {
		if (first == null) {
			create(element);
			return;
		}
		last.next = new Node(element);
		last = last.next;
		count++;
	}

	public void addFirst(E element) {
		if (first == null) {
			create(element);
			return;
		}
		Node n = new Node(element);
		n.next = first;
		first = n;
		count++;
	}

	public void addLast(E element) {
		if (first == null) {
			create(element);
			return;
		}
		Node n = new Node(element);
		last.next = n;
		n = last;
		count++;
	}

	public boolean contains(E element) {
		return indexOf(element) >= 0;
	}

	public E get(int index) {
		if (index >= size())
			throw new IndexOutOfBoundsException();
		Node p = first;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		return p.data;
	}

	public int indexOf(E element) {
		Node p = first;
		for (int i = 0; i < size(); i++) {
			if (element.equals(p.data))
				return i;
			p = p.next;
		}
		return -1;
	}

	public int size() {
		return count;
	}

	public void remove(int index) {
		Node p = first;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		p.next.next=p.next;
		count--;
	}

	public boolean remove(E element) {
		int n = indexOf(element);
		if (n >= 0) {
			remove(n);
			return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() { // Anonymous Class
			int nextIndex = -1;

			@Override
			public boolean hasNext() {
				if (nextIndex >= size() - 1)
					return false;
				return true;
			}

			@Override
			public E next() {
				if (nextIndex >= size() - 1)
					throw new NoSuchElementException();
				return get(++nextIndex);
			}

			@Override
			public void remove() {
				if (nextIndex <= 0)
					throw new RuntimeException("next() required before calling remove()");
				MyLinkedList.this.remove(nextIndex - 1);
			}
		};
	}
}
