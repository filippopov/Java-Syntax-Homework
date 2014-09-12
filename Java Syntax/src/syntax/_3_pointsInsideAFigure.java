package syntax;

import java.util.Scanner;

public class _3_pointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double X = input.nextDouble();
		double Y = input.nextDouble();
		if ((X>=12.5)&&(X<=22.5)&&(Y>=6)&&(Y<=8.5)) {
			System.out.println("Inside");
		}
		else if ((X>=12.5)&&(X<=17.5)&&(Y>=8.5)&&(Y<=13.5)) {
			System.out.println("Inside");
		}
		else if ((X>=20)&&(X<=22.5)&&(Y>=8.5)&&(Y<=13.5)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}

	}

}
