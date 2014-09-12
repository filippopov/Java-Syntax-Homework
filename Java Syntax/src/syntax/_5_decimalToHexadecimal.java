package syntax;

import java.util.Scanner;

public class _5_decimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int decimal= input.nextInt();
		String Hexa = Integer.toHexString(decimal);
		System.out.println(Hexa);

	}

}
