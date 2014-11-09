package sortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] stAge = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of students");
		int size = sc.nextInt();
		if (size > 0)
			stAge = new int[size];
		else {
			System.out.println("enter a number more than 0");
			return;
		}

		System.out.println("enter student age");
		for (int i = 0; i < stAge.length; i++) {
			// System.out.println("enter student age");
			stAge[i] = sc.nextInt();
		}

		System.out.println("Un-sorted ages are:");
		for (int age : stAge)
			System.out.println(age);

		System.out.println("sorting ages...");
		Arrays.sort(stAge);//Sorting the given array using the in-built class Arrays
		System.out.println("sorted ages are :");
		for (int age : stAge)
			System.out.println(age);

	}
}
