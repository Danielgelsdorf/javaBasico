import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, soma,c;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c=teclado.nextDouble();
		soma = (a*2+b*3+c*5)/3;
		System.out.printf("MEDIA = %.1f\n",soma);
		teclado.close();
	}
}
