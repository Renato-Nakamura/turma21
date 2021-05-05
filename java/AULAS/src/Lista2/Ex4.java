/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada 
 * do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double num=0.00;
		
		System.out.print("Digite um n�mero : ");
		num=leia.nextDouble();
		
		if(num%2==0) {
			System.out.printf("O seu n�mero � par e a raiz dele � %.2f",(Math.sqrt(num)));
		}else {
			System.out.printf("O seu n�mero � impar e o quadrado dele � %.2f",(Math.pow(num, 2.0)));
		}
	}
}
