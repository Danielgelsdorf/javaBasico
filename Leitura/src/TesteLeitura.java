import java.util.Scanner;

public class TesteLeitura {
	public static void main(String[] args) {
		int valor;
		double valor2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um valor");
		valor = teclado.nextInt();
		System.out.println("digite um valor");
		valor2 = teclado.nextDouble();
		System.out.println("primeiro valor =" + valor);
		System.out.println("segundo valor" + valor2);
		teclado.close();
	}
}
