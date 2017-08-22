package stack;

import java.util.Scanner;

public class MyStack {

	private final int maxSize;
	private final long[] stackArray;
	private int top;

	public MyStack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		stackArray[++top] = j;
	}

	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	// PUSH Functrion
	public static void insert(MyStack theStack) {
		Scanner sc = new Scanner(System.in);
		if (!theStack.isFull()) {
			System.out.println("how many inputs for Stack: ");
			int size = sc.nextInt();

			for (int i = 0; i < size; i++) {
				System.out.println("Enter the " + i + " input for Stack: ");
				long t = sc.nextInt();
				theStack.push(t);
			}
		} else {
			System.out.println("Stack is Full!!!");
		}
		sc.close();
	}

	// POP function
	public static void del(MyStack theStack) {
		Scanner sc = new Scanner(System.in);
		if (!theStack.isEmpty()) {

			System.out.println("How many element you want to pop? ");
			int r = sc.nextInt();
			// long tp = theStack.peek();
			for (int i = 0; i < r; i--) {
				// long value = theStack.pop();
				System.out.println("The poped element" + (theStack.pop()) + "\n");
				theStack.pop();
				// tp--;
			}

		} else {
			System.out.println("Stack is Empty!!!1");
		}
		sc.close();
	}

	// DISPLAY Function

	public static void display(MyStack theStack) {
		Scanner sc = new Scanner(System.in);
		if (!theStack.isEmpty()) {

			long tp = theStack.peek();
			while (!theStack.isEmpty()) {
				System.out.println("|" + tp + "|\n");
				tp--;
			}

		} else {
			System.out.println("Stack is Empty!!!1");
		}
		sc.close();
	}

	// SEARCH Function
	public static void search(MyStack theStack) {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyStack theStack = new MyStack(50);

		System.out.println(" 1. PUSH \n ");
		System.out.println(" 2. POP \n ");
		System.out.println(" 3. DISPLAY \n ");
		System.out.println(" 4. SEARCH \n ");

		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			insert(theStack);
			break;
		case 2:
			del(theStack);
			break;
		case 3:
			display(theStack);
			break;
		case 4:
			search(theStack);
			break;
		default:
			System.out.println("Wrong Choice!! ");

		}
		sc.close();
	}
}