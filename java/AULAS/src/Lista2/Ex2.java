/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
package Lista2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int[] num= {0,0,0};
		
		for(int x = 0;x<3;x++) {
			System.out.printf("Digite o %d � numero : ",(x+1));
			num[x]=leia.nextInt();
			
		}
		
		Arrays.sort(num);
		System.out.println("Os numeros em ordem crescente s�o : ");
		for(int x = 0;x<3;x++) {
			System.out.printf("\n%d � o n�mero : %d ",(x+1),(num[x]));

			
		}
		leia.close();
	}

}
