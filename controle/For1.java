package controle;

public class For1 {

	public static void main(String[] args) {
		
		// ESTRUTURA FOCADA EM DETERMINADA DE REPETI��ES
		
		// Primeiro parte = declara��o da variavel
		// Segunda parte = expressao que vai retornar V ou F
		// Terceira parte = manipula��o da variavel de controle
		
		for (int contador = 0; contador <= 20; contador+= 2) {
			System.out.printf("i = %d\n", contador);
		}
		
		// LA�O INFINITO COM FOR
		/*for (;;) {
			System.out.println("infinito");
		} */
		
	}
}
