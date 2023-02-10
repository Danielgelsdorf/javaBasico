import java.util.Scanner;

public class KW {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		int qtd;
		System.out.println("digite seu salário");
		salario = teclado.nextDouble();
		System.out.println("digite quantos KW gastou");
		qtd = teclado.nextInt();
		double salario100 = salario / 7;
		double kw = salario100 / 100;
		System.out.printf("valor do KW=%.2f ", kw);
		double valor = qtd * kw;
		System.out.printf("valor total da luz= %.2f", valor);
		double descValor = (valor * 10) / 100;
		descValor = valor - descValor;
		System.out.printf("valor com desconto = %.2f", descValor);
		teclado.close();
	}
}
