package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

	@Override
	public float soma(float a, float b) {
		return a + b;
	}

	@Override
	public float subtracao(float a, float b) {
		return a - b;
	}

	@Override
	public float multiplicacao(float a, float b) {
		return a * b;
	}

	@Override
	public float divisao(float a, float b) {
		return a / b;
	}

}
