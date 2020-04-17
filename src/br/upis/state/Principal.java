package br.upis.state;

public class Principal {

	public static void main(String[] args) {
		CalculadoraStateless csl = new CalculadoraStateless();
		
		System.out.println("Stateless");
		System.out.println(csl.adicao(3, 4));
		System.out.println(csl.adicao(3, 4));
		System.out.println(csl.adicao(3, 4));
		System.out.println(csl.adicao(3, 4));
		System.out.println(csl.adicao(3, 4));
		
		CalculadoraStatefull csf = new CalculadoraStatefull();
		
		System.out.println("Statefull");
		System.out.println(csf.adicao(3, 4));
		System.out.println(csf.adicao(3, 4));
		System.out.println(csf.adicao(3, 4));
		System.out.println(csf.adicao(3, 4));
		System.out.println(csf.adicao(3, 4));
	}
}
