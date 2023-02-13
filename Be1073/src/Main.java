import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num, quadrado = 2;
		System.out.println("digite um número");
		num = teclado.nextInt();
		while (quadrado < num) {
			int i = 1;
			if (i < 2) {
				quadrado = quadrado * i;
				System.out.println(quadrado);
				i++;
			}
			quadrado = quadrado * quadrado;
			if (quadrado < num) {
				System.out.println(quadrado);
			}

		}
		teclado.close();
	}

}
