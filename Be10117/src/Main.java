import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double n1,n2,nota,nota2;
	int i=0;
	nota=20;
	nota2=20;
	System.out.println("digite a nota");
	n1=teclado.nextDouble();
	System.out.println("digite a segunda nota");
	n2=teclado.nextDouble();
	do {
	if (n1>=0 &&n1<=10) {
		nota=n1;
	}
	else {
		System.out.println("digite a nota");
		n1=teclado.nextDouble();
	}
	if (n2>=0&& n2<=10) {
		nota2=n2;
	}
	else {
		System.out.println("digite a segunda nota");
		n2=teclado.nextDouble();
		
	}
	if (nota>=0 && nota <= 10 && nota2 >=0 && nota2 <= 10) {
		System.out.printf("notas válidas \n %.2f \n %.2f ",nota,nota2);
		i++;
	}
	}while(i==0);
	teclado.close();
}
}
