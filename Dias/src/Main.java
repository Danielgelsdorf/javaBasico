import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ano, mes, dia;
		int num;
		int res;
		num = teclado.nextInt();
		ano = num / 365;
		res=ano%365;
		mes=res/30;
		dia=mes%mes;
		
		System.out.println("anos" + ano);
		System.out.println("meses: " + res);
		System.out.println("dias" + dia);
	}
}