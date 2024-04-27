package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double a = (6*(3+2));
		double b = 3 * 2;
		double c = (1 - 5) * (2 - 7);
		double d = Math.pow(2, 2);
		
	
		double a2 = Math.pow(a, 2);
		System.out.println("A2 é igual a: " + a2);
		
				
		double c2 = Math.pow(c, 2);
		System.out.println("C2 é igual a: " + c2);
		
		double soma1UpE = a2 / b;
		System.out.println(soma1UpE);
		
		double soma2UpD = c2 / d;
		System.out.println("C2 é igual a: " + c2);
		
		double somaUP = soma1UpE - soma2UpD;
		System.out.println(somaUP);
		
		double totalUp = Math.pow(somaUP, 3);
		double totalDown = Math.pow(10, 3);
		
		double result = totalUp / totalDown;
		System.out.println("A resposta do desafio é: " + result);


		
	}
}
