package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		
		// USAR O WHILE  É MAIS INTERESSANTE QUANDO VOCÊ NÃO SABE QUANTAS
		// ENTRADAS VÃO EXISTIR
		
		while (!valor.equalsIgnoreCase("sair")) { // enquanto não for digitado "sair" , continue executando
			System.out.print("Você diz: ");
			entrada.nextLine();
			valor = entrada.nextLine(); // se não atribuir um valor fica em laço infinito
		} 
		
		entrada.close();
		
	}

}
