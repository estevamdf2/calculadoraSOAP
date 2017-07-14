package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Interface que define os metodos 
 * a serem utilizados pelo webService
 * 
 * @WebService: anotação que avisa ao compilador Java que o arquivo atual
 * corresponde à definição do Service Endpoint Inteface (SEI)
 * 
 * @SOAPBinding: indica que o serviço utilizará a abordagem SOAP
 * @author estevam
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {
	@WebMethod float soma(float num1, float num2);
	@WebMethod float subtracao(float num1, float num2);
	@WebMethod float multiplicacao(float num1, float num2);
	@WebMethod float divisao(float num1, float num2);
}