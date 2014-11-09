package example1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr1;


		System.out.println("enter array size");
		int size = sc.nextInt(); // size of the array

		arr1 = new int[size]; // int type array
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = i;
		System.out.println("printing int type array");
		for (int i = 0; i < arr1.length; i++) // using normal for loop
			System.out.println(arr1[i]);

		double[] arr2;	
		arr2 = new double[size]; // double type array
		double d = 123.456;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = d;
			d = d + 895.235;
		}
		System.out.println("printing double type array");
		for (double d1 : arr2) // using for-each loop
			System.out.println(d1);
		
		sc.close(); // closing the scanner
	}
}
