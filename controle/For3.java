package controle;

public class For3 {

	public static void main(String[] args) {
		
		/*int i= 0;
		for (; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("saiu do for..."); // PARA ACESSAR FORA DO FOR PRECISA DECLARAR A VARIAVEL FORA DO FOR
		System.out.println(i); */
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]\n", i, j);
			}
			System.out.println("");
		}
	}
}
