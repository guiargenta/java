package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n\n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário = %.2f\n", 2134.3245);
		System.out.printf("Nome: %s\n", "João\n\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();		
		
		System.out.printf("%s %s tem %d anos.\n",
				nome, sobrenome, idade);
		
		entrada.close();	
		
	}
}
