package syntax;

import java.util.Scanner;

public class _7_countOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String newNumber= Integer.toBinaryString(number); 
		int count = 0;
		for (int i = 0; i < newNumber.length(); i++) {
		int mask = number&1;
			if (mask==1) {
				count++;
				
			}
		number = number>>1;
		}
		System.out.println(count);

	}

}
