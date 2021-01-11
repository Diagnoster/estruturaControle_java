package controle;

public class For1 {

	public static void main(String[] args) {
		
		// ESTRUTURA FOCADA EM DETERMINADA DE REPETIÇÕES
		
		// Primeiro parte = declaração da variavel
		// Segunda parte = expressao que vai retornar V ou F
		// Terceira parte = manipulação da variavel de controle
		
		for (int contador = 0; contador <= 20; contador+= 2) {
			System.out.printf("i = %d\n", contador);
		}
		
		// LAÇO INFINITO COM FOR
		/*for (;;) {
			System.out.println("infinito");
		} */
		
	}
}
