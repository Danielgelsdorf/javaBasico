import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int km;
		double combusta;
		km = teclado.nextInt();
		combusta = teclado.nextDouble();
		double res = km / combusta;
		System.out.printf("%.3f km/l \n", res);
		teclado.close();
	}

}
