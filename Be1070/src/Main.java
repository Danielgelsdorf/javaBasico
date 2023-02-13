import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int num;
	num=teclado.nextInt();
	if (num%2!=0) {
		int i=0;
		while (i<=5) {
			num=num+2;
			System.out.println("números ímpares "+ num);
	i++;
		}
		}
		else {
			int i=0;
			num=num+1;
			while (i<5) {
				num=num+2;
				System.out.println("números ímpares: "+num);
				i++;
			}
		}
	
	teclado.close();
}
}
