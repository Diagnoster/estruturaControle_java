package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo --> 1
		// Segunda --> 2
		// ter�a --> 3
		// Quarta --> 4
		// Quinta --> 5
		// Sexta --> 6
		// S�bado --> 7
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next(); // next pega uma palavra, nextLine v�rias palavras
		
		if ("domingo".equalsIgnoreCase(dia)) { //compara��o entre strings n�o usar ==, 
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if ("ter�a".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println(3); // usar ou para ter a op��o ter�a e terca
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		} else if ("sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		} else {
			System.out.println("dia inv�lido!");
		}
		
		
		// outro m�todo invertido
		/*if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}
		*/
		
		
		
		
		entrada.close();
		
		
	}
}
