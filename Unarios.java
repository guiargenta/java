package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;  (incrementa antes)
		a--; // a = a - 1;
		
		++b; // b = b + 1; (incrementa depois)
		--b; // b = b - 1;
	
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio!");
		System.out.println(++a == b--); 
			// incrementa A, compara e dps incrementa B.
		System.out.println(a == b); 
		System.out.println(a);
		System.out.println(b);
	}
}
