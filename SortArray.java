import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter 5 numbers (input ends with 0): ");
		ArrayList<Integer> intArray = new ArrayList<>();
		int number;
		do {
			number = kb.nextInt();
			if (!intArray.contains(number) && number != 0)
				intArray.add(number);
		} while (number != 0);
		
		System.out.print("You entered the numbers: ");
		for (int i = 0; i < intArray.size(); i++)
			System.out.print(intArray.get(i) + " ");
		
		sortArrayL(intArray);
		// Collections.sort(intArray);
		System.out.println();
		
		System.out.print("The array sorted is: ");
		for (int i = 0; i < intArray.size(); i++)
			System.out.print(intArray.get(i) + " ");
		kb.close();

	}

	public static void sortArrayL(ArrayList<Integer> intArray) {
		for (int i = 0; i < intArray.size(); i++)
			for (int j = i; j < intArray.size(); j++)
				if (intArray.get(i) > intArray.get(j)) {
					int temp = intArray.get(i);
					intArray.set(i, intArray.get(j));
					intArray.set(j, temp);
				}
	}

}
