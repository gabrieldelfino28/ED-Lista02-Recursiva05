package controller;

public class MDC_Controller {
	public MDC_Controller() {
		super();
	}

	public int FuncMDC(int x, int y) {
		//Condi��o de parada --> Quando x for igual a y ap�s todas as opera��es e trocas de param�tros.
		
		if (x == y) {
			return x;
		}
		
		if(x < y) {//Quando x for menor que y, inverte os valores.
			return FuncMDC(y, x);
		}
		
		//Quando x for maior que y (x > y)
		int res = FuncMDC(x-y,y);
		return res;
		
		/*
		 * Primeiramente, a função recebe como parâmetro: x e y informados pelo usuário, e irá chamar a si mesma, realizando a
		 * subtração de x e y, até que x e y sejam iguais. Com isso, se x for menor que y, ele irá inverter os paramâtros, e cotinuára
		 * o processa até que ambos sejam iguais. Assim, chegando a sua condição de parada.
		 */
	}
}
