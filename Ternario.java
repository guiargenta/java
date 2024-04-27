package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		// var = condição ? "True" : "False";
		
		double media = 8.6;
		String resultadoFinal = media >= 7 ?
				"aprovado." : "em recuperação.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
	}
}
