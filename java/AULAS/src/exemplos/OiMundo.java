package exemplos;

import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {
		
		int num1,num2;
		String nome;
		double salario;
		char caracter='b';
		
		System.out.println("Ol� mundo!");//classes come�am com letra maiuscula
		System.out.println("Renato Yukio Ossiama Nakamura");
		Scanner leia = new Scanner(System.in);
		
		System.out.println("manda o nome");
		nome = leia.next();
				
		System.out.println("manda 2 num");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		
		System.out.println("salario manda");
		salario = leia.nextDouble();
		
		System.out.println("Seu nome � "+nome+" soma � "+(num1+num2)+" salario "+salario);
	}

}
