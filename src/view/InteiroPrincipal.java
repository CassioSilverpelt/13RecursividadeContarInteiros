package view;

import javax.swing.JOptionPane;

import controller.InteiroController;

public class InteiroPrincipal {
	public static void main(String[] args) {
		InteiroController intCon = new InteiroController();
		int num1 = 0;
		int num2 = -1;
		while (num1 < 10 || num1 > 999999) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser verificado, entre 10 e 999999: "));
			if (num1 < 10 || num1 > 999999) {
				JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
			}
		}
		while (num2 < 0 || num2 > 9) {
			num2  = Integer.parseInt(JOptionPane.showInputDialog("Digite o algarismo a ser verificado (de 0 a 9): "));
			if (num2 < 0 || num2 > 9) {
				JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
			}
		}
		
		System.out.println("Existem " + intCon.contarInteiros(num1, num2) + " algarismos " + num2 + " no número " + num1);
		
	}
}
