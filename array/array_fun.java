package array;

/*
 * To implements the different functions(add , delete , merge) on the array.
 * @author Div (Vidhikara)
 *
 */
import java.util.Scanner;

public class array_fun {
	public static void main(String[] args) {
		getOptions();
	}

	// Function to select the mode of operation
	private static void Operation(int opt) {

		Scanner sc = new Scanner(System.in);
		int input = 2;
		String[] names = new String[input];
		String response = "";
		if (opt == 1) {
			do {
				int result = search(names, getNames());
				if (result == -1) {
					System.out.println("No match Found! \n");
				} else {
					System.out.println("Match Found! \n");
				}
				System.out.println("Do you want to Search again? (y/n): ");
				response = sc.nextLine();
				if (response.equalsIgnoreCase("n")) {
					getOptions();
				}
			} while (response.equalsIgnoreCase("y"));
		} else if (opt == 2) {
			insert(response, names, input); // Insert an element
		} else if (opt == 3) {
			del(response, names);// Delete an element
		} else {
			System.out.println("Not a valid Response");
		}
		sc.close();
	}

	public static String getNames() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		sc.close();
		return name;

	}

	// Functions to get the Input Options
	public static void getOptions() {
		Scanner sc = new Scanner(System.in);
		int opt;
		System.out.println("*************\n");
		System.out.println("1. SEARCH \n");
		System.out.println("2. INSERT \n");
		System.out.println("3. DELETE \n");
		opt = sc.nextInt();
		Operation(opt);
		sc.close();
	}

	// Function to search elements in Array
	public static int search(String[] names, String name) {
		int index = 0;
		int element = -1;
		boolean key = false;
		while (!key && index < names.length) {
			if (names[index].equalsIgnoreCase(name)) {
				key = true;
				element = index;
			}
			index++;
		}
		return element;
	}

	// Function to insert a Element in Array

	public static void insert(String response, String[] names, int input) {
		Scanner sc = new Scanner(System.in);
		do {
			int x = 0;
			System.out.println("Enter the new Name: ");
			names[x] = sc.nextLine();
			System.out.println("Do you want to add again?(y/n): ");
			response = sc.nextLine();
			if (response.equalsIgnoreCase("y")) {
				x++;
				if (x == 2) {
					int add = input + 1;
					names = new String[add];
					System.out.println("Enter the new Name: ");
					names[add] = sc.nextLine();
					System.out.println("Do you want to add again?(y/n): ");
					response = sc.nextLine();
					if (response.equalsIgnoreCase("y")) {
						add++;
					}
				}
			} else if (response.equalsIgnoreCase("n")) {
				getOptions();
			} else {
				System.out.println("Enter the valid Case!! ");
			}
		} while (response.equalsIgnoreCase("y"));
		sc.close();
	}

	// Function for DELETEing an element from Array
	public static void del(String response, String[] names) {

		Scanner sc = new Scanner(System.in);
		String dname;
		System.out.println("Enter the names to be deleted: ");
		dname = sc.nextLine();
		int size = names.length;
		for (int i = 0; i < size; i++) {
			if (names[i].equalsIgnoreCase(dname)) {
				--size;
				for (; i < size; ++i) {
					names[i] = names[i + 1];
				}
			}
		}
		sc.close();
	}
}
