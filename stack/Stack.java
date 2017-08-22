package stack;

/*
 * Java Program to Implement Stack
 */
import java.util.*;

class arrayStack {
	protected int arr[];
	protected int top, size, len;

	/* Constructor for arrayStack */
	public arrayStack(int n) {
		size = n;
		len = 0;
		arr = new int[size];
		top = -1;
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return top == -1;
	}

	/* Function to check if stack is full */
	public boolean isFull() {
		return top == size - 1;
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return len;
	}

	/* Function to check the top element of the stack */
	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return arr[top];
	}

	/* Function to add an element to the stack */
	public void push(int i) {
		if (top + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		if (top + 1 < size)
			arr[++top] = i;
		len++;
	}

	/* Function to delete an element from the stack */
	public int pop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		len--;
		return arr[top--];
	}

	/* Function to display the status of the stack */
	public void display() {
		System.out.print("\nStack = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = top; i >= 0; i--)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

/* Class StackImplement */
public class Stack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Stack Test\n");
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt();
		/* Creating object of class arrayStack */
		arrayStack stk = new arrayStack(n);
		/* Perform Stack Operations */
		char ch;
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			System.out.println("6. Size of Stack");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				try {
					stk.push(scan.nextInt());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Popped Element = " + stk.pop());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element = " + stk.peek());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty status = " + stk.isEmpty());
				break;
			case 5:
				System.out.println("Full status = " + stk.isFull());
				break;
			case 6:
				System.out.println("Size = " + stk.getSize());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* display stack */
			stk.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		scan.close();
	}
}