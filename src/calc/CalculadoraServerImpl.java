package calc;

import javax.jws.WebService;

/**
 * Classe que implementa a interface
 * a anotação
 * @WebService: faz com que a classe atual, a SIB
 * (Service Implementation Bean) ligue-se ao SEI
 * 
 * @author estevam
 *
 */
@WebService(endpointInterface = "calc.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {
		
	public float soma(float num1, float num2) {
		return num1 + num2;
	}
	
	public float subtracao(float num1, float num2) {
		return num1 - num2;
	}

	public float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}

	public float divisao(float num1, float num2) {
		return num1 / num2;
	}

}