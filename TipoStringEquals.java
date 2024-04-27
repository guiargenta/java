package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		
		
		// Equals é para comparar Strings!
		// pega o valor de dentro da variável
		// Compara os conteúdos
		System.out.println("2".equals(s)); 
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();  // nextLine não apaga espaços em branco
		System.out.println(s2);
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		// trim remove os espaços em brancos
		
		
		entrada.close();
		
	}
}
