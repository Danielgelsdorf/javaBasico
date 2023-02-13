import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int senha=2002,i=0;	
	do {
		System.out.println("digite a senha para entrar");
		int entrada=teclado.nextInt();
		if (entrada != senha) {
			System.out.println("digite a senha para entrar");
			entrada=teclado.nextInt();
		}
		else {
			System.out.println("acesso permitido");
			i++;
		}
	} while (i==0);
	teclado.close();
	}
}
