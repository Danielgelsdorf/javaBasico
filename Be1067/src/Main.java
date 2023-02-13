import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int X, impar = 1;
		X = teclado.nextInt();

		do {
			System.out.println(impar);

			impar = impar + 2;
		} while (impar <= X);

		teclado.close();
	}
}