package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// calcular media de notas , pode ter varios nao se sabe
		// nota valida de 0 a 10
		// armazenar a nota na variavel total
		// sempre que outra nota for adiciona , colocar no total
		// outra variavel para quantas nota validas foram digitadas
		// para sair é -1
		// se digitar nota invalida repetir ate digitar certa
		
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) { //enquanto a nota for diferente de -1 faça isso
			System.out.println("Informe a nota:  ( ou -1 para sair) ");
			nota = entrada.nextDouble();
			
			if (nota <=10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
				
			} else if (nota != -1) { //  ele só vai vir pra aqui se a nota for inválida, mas se a nota for diferente de -1 q ele vai mostrar q é invalida
				System.out.println("Nota Inválida!!!");
			}
			
			
		}
		
		//calcular media
		double media = total / quantidadeDeNotas;
		
		//resultados
		System.out.println("Média = " + media);
		System.out.println("Nota Total: " + total);
		System.out.println("Quantidade de Notas: " + quantidadeDeNotas);
		
		entrada.close();
	}
	
	
}
