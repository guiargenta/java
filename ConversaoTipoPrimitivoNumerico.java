package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1.123456788888;  // Implícita
		System.out.println("Double: " + a);
		
		float b = (float) 1.123456788888; // Explícita (CAST)
		System.out.println("Float: " + b);
	}
}
