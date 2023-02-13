import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int entrada;
		Scanner teclado = new Scanner(System.in);
		int i = 0,j;
		entrada = teclado.nextInt();
		while (i <= 10) {
			j=entrada*i;
			System.out.println(j);
			i++;
		}
	}
}
