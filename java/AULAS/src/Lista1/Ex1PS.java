/*
 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
 */

package Lista1;

import java.util.Scanner;

public class Ex1PS {
	public static void main(String[] args) {
		String nome;
		int anos, meses, dias;
		int resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = leia.next();
		System.out.println("Quantos anos voc� tem, "+nome+"? ");
		anos = leia.nextInt();
		System.out.println("Agora, quantos meses de vida? ");
		meses = leia.nextInt();
		System.out.println("E dias? ");
		dias = leia.nextInt();
		
		resultado = (365*anos)+(30*meses)+(dias);
		System.out.println("Parabens "+nome +" voc� tem "+resultado+" dias de vida!!!");
		
	}
}
