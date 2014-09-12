package syntax;

import java.util.Scanner;

public class _8_countOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int number =input.nextInt();
		String Bin = Integer.toBinaryString(number);
		int countOne=0;
		int countZero =0;
		for (int i = 0; i < Bin.length(); i++) {
			int mask = number&1;
			int numberTwo=0;
			int maskTwo=0;
			if (mask==1) {
				numberTwo=number>>1;
				maskTwo = numberTwo&1;
				if (maskTwo==1) {
					countOne++;
				}
			}
			else if (mask==0) {
				numberTwo=number>>1;
				maskTwo = numberTwo&1;
				if (maskTwo==0) {
					countZero++;
				}
			}
			number=number>>1;
		}
		int rezult = countOne+countZero;
		System.out.println(rezult);

	}

}
