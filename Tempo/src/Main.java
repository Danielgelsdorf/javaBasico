import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora, horaS, tempo, min, minF;
		hora = teclado.nextInt();
		min = teclado.nextInt();
		horaS = teclado.nextInt();
		minF = teclado.nextInt();
		int tempoInicial = (hora * 60) + min;
		int tempoFinal = (horaS * 60) + minF;
		int duracao = tempoFinal - tempoInicial;
		if (duracao <= 0) {
			duracao = duracao + 24;
		}
		int ultima = duracao / 60;
		int ultimo = duracao % 60;
		System.out.printf("o jogo durou%d horas e %d minutos", ultima, ultimo);

		teclado.close();
	}
}