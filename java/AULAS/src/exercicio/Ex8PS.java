/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica
 *  com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
 *   Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 *    escrever um sistema que leia o custo de f�brica de um carro e escreva o
 *     custo ao consumidor. 
 */

package exercicio;

import java.util.Scanner;

public class Ex8PS {
	public static void main(String args[]) {
		final double impostos=0.45, distribuidor=0.28;
		double custoFabrica,custoFinal;
		Scanner leia = new Scanner(System.in);
		
				
		System.out.println("Qual o custo de fabrica? ");
		custoFabrica = leia.nextDouble();
		
		custoFinal = (1+impostos+distribuidor)*custoFabrica;
		System.out.println("O custo final ser� de "+custoFinal);
	}
}
