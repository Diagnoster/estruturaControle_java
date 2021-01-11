package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {           // NÃO É OBRIGADO A COLOCAR BLOCO DE CÓDIGO
		case 10:
			conceito = "A";
			break;
		case 9:
			conceito = "A";
			break;
		case 8:
			conceito = "B";
			break;
		case 7:
			conceito = "B";
			break;
		case 6:
			conceito = "C";
			break;
		case 5:
			conceito = "C";
			break;
		case 4: case 3:         // PODEMOS COLOCAR MAIS DE UM CASE JUNTO
			conceito = "D";     // COM O MESMO CÓDIGO
			break;
		case 2: case 1: case 0:
			conceito = "F";
			break;
		default:
			conceito ="Não informado";    // O ÚLTIMO NÃO PRECISA COLOCAR BREAK, 
										// SE QUISER MOVER O DEFAULT PRA CIMA COLOCAR BREAK;
		}
		
		System.out.println("Conceito é: " + conceito);
		entrada.close();
	}
}
