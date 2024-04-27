package fundamentos;

import java.util.Scanner;

public class ExercicosFundamentosPotencia {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Digite um número: ");
		double num1 = entrada.nextInt();
		
		double numQuad = Math.pow(num1, 2);
		double numCubo = Math.pow(num1, 3);
		
		System.out.println("O número escolhido ao quadrado é: " + numQuad);
		System.out.println("O número escolhido ao cubo é: " + numCubo);
		
		System.out.printf("%.2f ao quadrado é: %.2f. \n", num1, numQuad);
		System.out.printf("%.2f ao cubo é igual a: %.2f.", num1, numCubo);
			
		
		
		entrada.close();
		
	}
}
