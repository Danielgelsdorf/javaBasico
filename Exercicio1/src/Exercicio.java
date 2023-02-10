import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		double valor, hora;
		int desconto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite quantas horas trabalhou");
		hora = teclado.nextDouble();
		System.out.println("digite quantos %deseja dar de desconto");
		desconto = teclado.nextInt();
		System.out.println("digite qual o valor do salário");
		valor = teclado.nextDouble();
		double desc = (valor * desconto) / 100;
		desc = valor - desc;
		System.out.println("Salário final= " + desc);
		teclado.close();
	}
}
