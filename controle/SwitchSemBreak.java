package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// if (bool) ... 
		// while (bool) ...
		//for (;bool;) ...
		// switch recebe diretamente o valor
		// ESTE SWITCH É SEM BREAK, executando todos que estão abaixos do selecionado.
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha": 
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break;  // AQUI TEM UM BREAK
		default:
			System.out.println("Não sei nada");
		}
		
		int idade = 2;
		
		switch (idade) {
		case 2:
			System.out.println("sabe falar");
		case 1:
			System.out.println("sabe andar");
		case 0:
			System.out.println("sabe respirar");
		}
		
	}
}
