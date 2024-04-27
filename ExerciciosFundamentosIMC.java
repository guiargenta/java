package fundamentos;

import java.util.Scanner;

public class ExerciciosFundamentosIMC {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é de: %.2f", imc);
		
		
		entrada.close();
		
	}
}
