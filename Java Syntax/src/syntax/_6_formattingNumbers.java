package syntax;

import java.util.Scanner;

public class _6_formattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		System.out.printf("|%s     |%s|     %.2f|%.3f  |",Integer.toHexString(a),Integer.toBinaryString(a),b,c);

	}

}
