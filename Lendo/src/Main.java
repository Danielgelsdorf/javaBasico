import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
int num;
int par,pose,nega,impar;
pose=0;
par=0;
impar=0;
nega=0;
for( int i=0; i<=6; i++){
	System.out.println("digite um número");
	num=teclado.nextInt();
	if(num>=0) {
		pose=pose+1;
		
	}
	if (num <0) {
		nega=nega+1;
	}
	if(num %2==0) {
		par=par+1;
	}
	if(num !=0) {
		impar=impar+1;
	}
}
System.out.printf("foram digitados %d números pares\n %d números ímpares\n %d números positivos \n e %d números negativos",par,impar,pose,nega);
teclado.close();
	}
	
}
