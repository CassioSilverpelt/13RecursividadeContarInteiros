package controller;

public class InteiroController {
	public InteiroController() {
		super();
	}
	
	public int contarInteiros (int a, int b) {
		if (a < 10) {
			if (a%10 == b) {
				return 1;
			} else {return 0;}
			//Se o num1 for menor do que 10, ele verifica se o resto é igual ao num2, retorna 1 ou 0 de acordo, porém não há mais como diminuir o num1, então encerra aqui.
		} else if (a%10 == b) {
			return 1 + contarInteiros((a/10), b);
		} else {
			return 0 + contarInteiros((a/10), b);
			//Se o resto da divisão for igual ao num2, ele soma 1, se não, soma 0 e ambos pedem novamente a recursão.
		}
	}
	
}
