package syntax;

import java.util.Scanner;

public class _4_theSmallestOfTreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int smallestNumber =Integer.MAX_VALUE;
		int []numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=input.nextInt();
			if (numbers[i]<smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		System.out.println(smallestNumber);
		
	}

}


