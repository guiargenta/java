package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.print("Aprovado");
		}
		// Posso criar variável para melhorar o IF.
		boolean criterioReprovacaoAtingido = 
				media < 7 && media >= 4.5;
	//	else if (media < 7 && media >= 4.5) {
		if(criterioReprovacaoAtingido) 
			System.out.print("Recuperação.");
		
		else {
			System.out.print("Reprovado.");
		}
		
		entrada.close();
	}
}
