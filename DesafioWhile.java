package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qntNotas = 0;
		double media = 0;
		double total = 0;
		double nota = 0;
		String sair = "";
		
		while(qntNotas <5) {
			System.out.println("Digite a sua nota na prova: ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) { 
			total += nota;
			qntNotas++;
			}
			else {
				System.out.println("Nota Inválida!\nDigite uma nota válida.");
				}
			}
		while(!sair.equalsIgnoreCase("-1")) {
			System.out.println("Digite a palavra para saber a média e encerrar o programa: ");
			sair = entrada.next(); 
			}
			media = total / qntNotas;
		System.out.printf("A média  das notas é %.2f", media);
		
		
		entrada.close();
	
	}
}
