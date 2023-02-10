import java.util.Scanner;

public class Carro {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int tempo, velo;
	
	System.out.println("digite a velocidade média");
	velo=teclado.nextInt();
	System.out.println("digite quanto tempo levou");
	tempo=teclado.nextInt();
	double distancia=velo*tempo;
	distancia=distancia/12;
	System.out.println("o carro gastou: "+distancia);
	teclado.close();
}
}
