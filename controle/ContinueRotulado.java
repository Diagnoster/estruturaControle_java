package controle;

public class ContinueRotulado {

	public static void main(String[] args) {
		// EVITAR AO M�XIMO USAR ESTE TIPO DE BREAK
		
		externo: for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					continue
					externo; // sai do la�o mais interno, n�o do externo, 
							// se quiser sair do externo, colocar um rotulo : break externo;
				}
				
				System.out.printf("%d %d ", i, j);
				
			}
			
			System.out.println();
			
			
		}
	
		System.out.println("fim");
	}
}
