package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo --> 1
		// Segunda --> 2
		// terça --> 3
		// Quarta --> 4
		// Quinta --> 5
		// Sexta --> 6
		// Sábado --> 7
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next(); // next pega uma palavra, nextLine várias palavras
		
		if ("domingo".equalsIgnoreCase(dia)) { //comparação entre strings não usar ==, 
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println(3); // usar ou para ter a opção terça e terca
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		} else if ("sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		} else {
			System.out.println("dia inválido!");
		}
		
		
		// outro método invertido
		/*if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}
		*/
		
		
		
		
		entrada.close();
		
		
	}
}
