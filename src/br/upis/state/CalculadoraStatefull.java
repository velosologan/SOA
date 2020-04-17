package br.upis.state;

public class CalculadoraStatefull {
	
	private int memoria;
	
	public int adicao(int a, int b) {
		memoria += a + b;
		return memoria;
	}
}
