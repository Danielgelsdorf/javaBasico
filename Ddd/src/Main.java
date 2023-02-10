import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ddd;
		ddd = teclado.nextInt();
		switch (ddd) {
		case 61:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("são paulo");
			break;
			case 21: System.out.println("Rio de Janeiro");
			break;
			case 32: System.out.println("Belo Horizonte");
			break;
		case 19:
			System.out.println("Juiz de Fora");
			break;
		case 32:
			System.out.println("Campinas");
			break;
			case 27: System.out.println("vitoria");
			break;
		default:
			System.out.println("ddd não cadastrado");
		}
		teclado.close();
	}
}