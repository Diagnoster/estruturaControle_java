package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		
		// USAR O WHILE  � MAIS INTERESSANTE QUANDO VOC� N�O SABE QUANTAS
		// ENTRADAS V�O EXISTIR
		
		while (!valor.equalsIgnoreCase("sair")) { // enquanto n�o for digitado "sair" , continue executando
			System.out.print("Voc� diz: ");
			entrada.nextLine();
			valor = entrada.nextLine(); // se n�o atribuir um valor fica em la�o infinito
		} 
		
		entrada.close();
		
	}

}
