package calc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {

	@WebMethod
	float soma(float a, float b);

	@WebMethod
	float subtracao(float a, float b);

	@WebMethod
	float multiplicacao(float a, float b);

	@WebMethod
	float divisao(float a, float b);

}
