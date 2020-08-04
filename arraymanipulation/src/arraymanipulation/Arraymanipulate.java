package arraymanipulation;

import java.util.Scanner;

public class Arraymanipulate {
	int max_size = 5;

	int arr[] = new int[max_size];
	int max = 0, min = 9999;

//	user input
	void userinput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < max_size; i++) {
			arr[i] = sc.nextInt();
		}
	}

//	max-min finder 
	void maxMinFinder() {
		for (int i = 0; i < max_size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
	}

//	short input 
	void shortInput() {
		for (int i = 0; i < max_size - 1; i++) {
			for (int j = i + 1; j < max_size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter an array value:");
		Arraymanipulate arrins = new Arraymanipulate();
		arrins.userinput();
//		arrins.maxMinFinder();
		arrins.shortInput();
		System.out.println(
				"Maximum Number is : " + arrins.arr[arrins.max_size - 1] + " minimum number is " + arrins.arr[0]);

	}

}
