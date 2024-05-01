package Controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.printf("x = %d\n", contador);
			contador ++;
		}
		
		contador = 1;
		
		while(contador <= 20) {
			System.out.printf("y = %d\n", contador);
			contador += 2;
		}
		System.out.print("Fim!");
	}
}
