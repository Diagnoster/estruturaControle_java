package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		int numero = Integer.parseInt(valor); // Transformar String em um n�mero.
		
		if(numero % 2 == 0) {
			System.out.println("N�mero Par");
		} else {
			System.out.println("N�mero �mpar");
		}
		
		
		
	}

}
