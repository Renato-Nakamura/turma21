package exemplos;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class EscolaG3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		final int MOVIMENTACOES = 10;
		int matricula = 0, niver = 0,DIA=0;
		String cpf, inserirNota = "Digite I para inclus�o de notas ou R para retirada de notas: ";
		double pontosTotais = 0.00, notaExtra = 0.00, usoExtra = 0.00;
		double pontos[] = new double[MOVIMENTACOES];
		boolean status, usarCreditoMestrado, bonusGrad=false;
		char resposta, tipoConta, continuar,tipoMovimento,respGrad;

		System.out.println("ESCOLA GERA��O G3");
		System.out.println("Assista. Aprenda. Execute \n");
		System.out.print("Digite sua matr�cula: ");
		matricula = leia.nextInt();
		System.out.print("Digite seu CPF: ");
		cpf = leia.next();
		System.out.print("\nStatus da m�tricula? (1 - ativa / 2 - inativa) ");
		resposta = leia.next().toUpperCase().charAt(0);
		status = (resposta == '1');
		// segunda tela
		System.out.println("--------------------------------------------------------");
		System.out.println("ESCOLA GERA��O G3");
		System.out.println("Assista. Aprenda. Execute ");
		System.out.println("========================================================");
		System.out.printf("Matr�cula: %d \n", matricula);
		System.out.printf("CPF : %s \n", cpf);
		if (status) {
			System.out.println("A conta do aluno(a) est� ativa.");
		} else {
			System.out.println("A conta do aluno(a) est� inativa.");
		}
		System.out.println("***TIPO DE ENSINO:***");
		System.out.println("\n 1- B�SICO\n 2- M�DIO\n 3- GRADUA��O\n 4- P�S\n 5- MESTRADO\n 6- SAIR\n");
		System.out.print("\nDIGITE O C�DIGO DA OP��O SELECIONADA: ");
		tipoConta = leia.next().charAt(0);
		System.out.println("--------------------------------------------------------");

		if (tipoConta == '1') {
			System.out.println("ENSINO B�SICO");
			System.out.print("Digite o dia do seu anivers�rio : ");
			niver = leia.nextInt();
			System.out.print("Digite o dia de hoje : ");
			DIA = leia.nextInt();
		} else if (tipoConta == '2') {
			System.out.println("ENSINO M�DIO");
		} else if (tipoConta == '3') {
			System.out.println("ENSINO GRADU��O");
		} else if (tipoConta == '4') {
			System.out.println("ENSINO P�S");
			inserirNota += " \n(Caso queira utilizar sua nota extra pressione Z) ";
			notaExtra = 5;
		} else if (tipoConta == '5') {
			System.out.println("ENSINO MESTRADO");
			inserirNota += " \n(Caso queira utilizar sua nota extra pressione Z) ";
			notaExtra = 10;
		} else if (tipoConta == '6') {
			System.out.println("SAIR");
			System.exit(1);
		}
		// tela 3
		System.out.println("ESCOLA GERA��O G3");
		System.out.println("Assista. Aprenda. Execute ");
		System.out.println("========================================================");
		System.out.printf("Matr�cula: %d \n", matricula);
		System.out.printf("CPF : %s \n", cpf);
		if (status) {
			System.out.println("A conta do aluno(a) est� ativa.");
		} else {
			System.out.println("A conta do aluno(a) est� inativa.");
		}
		System.out.printf("Nota atual : %.1f \n", pontosTotais);
		System.out.println("---MOVIMENTOS---");
		System.out.println("VOC� POSSUI O LIMITE DE 10 MOVIMENTA��ES");
		
		for(int i=0;i<MOVIMENTACOES;i++) {
			System.out.printf("Mov. %d %s",(i+1),inserirNota);
			tipoMovimento = leia.next().toUpperCase().charAt(0);
			if(tipoMovimento =='I') {
				System.out.println("Pontos totais : "+pontosTotais);
				System.out.print("Valor a ser inclus�o na nota: ");
				pontos[i]=leia.nextDouble();
				pontosTotais += pontos[i];
				if(bonusGrad ==false) {
					if(tipoConta=='3' && pontosTotais<0) {
						System.out.println("Nota negativa. Deseja utilizar seu b�nus de gradua��o? [2 pontos] (S-Sim/N-N�o) ");
						respGrad = leia.next().toUpperCase().charAt(0);
						if(respGrad=='S') {
							bonusGrad=true;
							pontosTotais+=2;
							System.out.println("B�nus adicionado com sucesso!!!\n");
						}
						
					}
				}
				System.out.print("Continuar? S-sim/N-n�o: ");
				continuar =leia.next().toUpperCase().charAt(0);
				if(continuar=='N') {
					i=MOVIMENTACOES;				
				}
			}else if(tipoMovimento =='R') {
				System.out.println("Pontos totais : "+pontosTotais);
				System.out.print("Valor a ser excluido na nota: ");
				pontos[i]=leia.nextDouble();
				pontosTotais -= pontos[i];
				if(bonusGrad ==false) {
					if(tipoConta=='3' && pontosTotais<0) {
						System.out.println("Nota negativa. Deseja utilizar seu b�nus de gradua��o? [2 pontos] (S-Sim/N-N�o) ");
						respGrad = leia.next().toUpperCase().charAt(0);
						if(respGrad=='S') {
							bonusGrad=true;
							pontosTotais+=2;
							System.out.println("B�nus adicionado com sucesso!!!\n");
						}
						
					}
				}
				System.out.print("Continuar? S-sim/N-n�o: ");
				continuar =leia.next().toUpperCase().charAt(0);
				if(continuar=='N') {
					i=MOVIMENTACOES;				
				}
			}else if(tipoMovimento =='Z') {
				System.out.println("Pontos totais : "+pontosTotais);
				System.out.printf("Valor a ser inclus�o na nota: (Dispon�vel %.1f pontos)",notaExtra);
				usoExtra = leia.nextDouble();
				if(usoExtra<=notaExtra) {
					notaExtra-= usoExtra;
					pontosTotais+=usoExtra;
					i--;
					System.out.println("Foram adicionados "+usoExtra+" pontos e sobraram "+notaExtra);
					System.out.print("Continuar? S-sim/N-n�o: ");
					continuar =leia.next().toUpperCase().charAt(0);
					if(continuar=='N') {
						i=MOVIMENTACOES;				
					}					
				}else {
					System.out.println("N�o possui essa nota extra para ser adicionada, volte a inclus�o de notas");
					i--;
				}
			}else {
				i--;
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("ESCOLA GERA��O G3");
		System.out.println("Assista. Aprenda. Execute ");
		System.out.println("========================================================");
		System.out.printf("Matr�cula: %d \n", matricula);
		System.out.printf("CPF : %s \n", cpf);
		if (status) {
			System.out.println("A conta do aluno(a) est� ativa.");
		} else {
			System.out.println("A conta do aluno(a) est� inativa.");
		}
		if (tipoConta == '1') {
			System.out.println("ENSINO B�SICO");
			if(niver == DIA) {
				pontosTotais = (pontosTotais*0.1)+ pontosTotais;
				System.out.println("Parab�ns! Voc� tem direito a um acr�scimo b�nus de 10% na sua nota final!");
				System.out.printf("\nSua nota final com o b�nus � de: %.1f" ,pontosTotais);			
			}else {
				System.out.println("\nVoc� n�o tem direito ao b�nus de anivers�rio");
				System.out.println("Pontos totais : "+pontosTotais);
			}
		} else if (tipoConta == '2') {
			System.out.println("ENSINO M�DIO");
			System.out.print("\nDeseja realizar a impress�o do seu boletim? S-sim / N-n�o ");
			tipoMovimento=leia.next().toUpperCase().charAt(0);
			if(tipoMovimento=='S') {
				for(int i=3;i>0;i--) {
					System.out.println("Voce tem "+ (i-1)+ " solicita��o(�es) para impress�o do boletim este m�s\n");
					for(int j=0;j<MOVIMENTACOES;j++) {
						System.out.printf("Atividade : %d \t Pontua��o : %.1f \n",(j+1),pontos[j]);
						
					}
					if(i>1) {
						System.out.println("\nDeseja solicitar o boletim novamente? S-sim/N-n�o: ");
						tipoMovimento=leia.next().toUpperCase().charAt(0);
						if(tipoMovimento=='N') {
							i=0;
						}
					}
				}
			}
		} else if (tipoConta == '3') {
			System.out.println("ENSINO GRADU��O");
			System.out.println("Pontos totais : "+pontosTotais);
			
		} else if (tipoConta == '4') {
			System.out.println("ENSINO P�S");
			System.out.print("Deseja utilizar os seus creditos? S-sim / N-n�o");
			tipoMovimento=leia.next().toUpperCase().charAt(0);
			if(tipoMovimento=='S') {
				System.out.println("Quantos pontos quer utilizar? Disponivel "+notaExtra+" creditos");
				usoExtra = leia.nextDouble();
				if(usoExtra<=notaExtra) {
					notaExtra-= usoExtra;
					pontosTotais+=usoExtra;
					System.out.println("Foram adicionados "+usoExtra+" pontos e sobraram "+notaExtra);		
				}else {
					System.out.println("N�o possui essa nota extra para ser adicionado");
					
				}
			}
			System.out.println("Pontos totais : "+pontosTotais);
				
		} else if (tipoConta == '5') {
			System.out.println("ENSINO MESTRADO");
			System.out.print("Deseja utilizar os seus creditos? S-sim / N-n�o");
			tipoMovimento=leia.next().toUpperCase().charAt(0);
			if(tipoMovimento=='S') {
				System.out.println("Quantos pontos quer utilizar? Disponivel "+notaExtra+" creditos");
				usoExtra = leia.nextDouble();
				if(usoExtra<=notaExtra) {
					notaExtra-= usoExtra;
					pontosTotais+=usoExtra;
					System.out.println("Foram adicionados "+usoExtra+" pontos e sobraram "+notaExtra);		
				}else {
					System.out.println("N�o possui essa nota extra para ser adicionado");
					
				}
			}
			System.out.println("Pontos totais : "+pontosTotais);
				
		}
	}
}
