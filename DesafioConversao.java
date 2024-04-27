package fundamentos;

// import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// System.out.println(Locale.getDefault());
		
		// REPLACE para trocar a "," por "."
		System.out.println("Digite o seu 1º salario: ");
		String valor1 = entrada.next().replace(",", ".");
		System.out.println("Seu 1º salário era: R$ " + valor1);
				
		
		double salario1 = Double.parseDouble(valor1);
		
		System.out.println("Digite o seu 2º salário: ");
		String valor2 = entrada.next().replace(",", ".");
		System.out.println("O seu 2º salário foi de: R$ " + valor2);
		
		double salario2 = Double.parseDouble(valor2);
		
		System.out.println("Digite o seu 3º salário: ");
		String valor3 = entrada.next().replace(",", ".");
		System.out.println("O seu 3º salário foi de: R$ " + valor3);
		
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma / 3;
		
		System.out.printf("A média dos 3 salários é de: R$ %.2f", (media));
				
		entrada.close();
	}
}
