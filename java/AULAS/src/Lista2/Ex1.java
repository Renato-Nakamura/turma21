/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int num[]= {0,0,0};
		int numMax=0;
		
		/*System.out.println("Escreva o primeiro n�mero : ");
		num1 = leia.nextInt();
		System.out.println("Escreva o segundo n�mero : ");
		num2 = leia.nextInt();
		System.out.println("Escreva o terceiro n�mero : ");
		num3 = leia.nextInt();
		*/
		for(int x=0;x<3;x++) {
			System.out.printf("Escreva o %d � n�mero : ",(x+1));
			num[x] = leia.nextInt();	
			if(num[x]>numMax) {
				numMax=num[x];
			}
			
		}
		System.out.printf("O maior valor dos digitados � o %d",numMax);

	}

}
