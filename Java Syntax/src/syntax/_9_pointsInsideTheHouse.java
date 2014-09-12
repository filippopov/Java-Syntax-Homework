package syntax;

import java.util.Scanner;

public class _9_pointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double X = input.nextDouble();
		double Y = input.nextDouble();
		double x1 = 12.5, y1 = 8.5;
		double x2 = 17.5, y2 = 3.5;
		double x3 = 22.5, y3 = 8.5;

		double abc = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double abp = (x1 * (y2 - Y) + x2 * (Y - y1) + X * (y1 - y2));
		double apc = (x1 * (Y - y3) + X * (y3 - y1) + x3 * (y1 - Y));
		double pbc = (X * (y2 - y3) + x2 * (y3 - Y) + x3 * (Y - y2));
		if ((abp+apc+pbc)==abc) {
			System.out.println("Inside");
		}
		else if  ((X>=12.5)&&(X<=17.5)&&(Y>=8.5)&&(Y<=13.5)) {
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
