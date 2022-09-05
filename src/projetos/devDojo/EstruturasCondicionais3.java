package projetos.devDojo;

public class EstruturasCondicionais3 {
	public static void main(String[] args) {
		double salario = 6000;
		// Doar se o salario > 5000;
		
		/*String mensagemDoar = "Eu vou doar X para o DevDojo.";
		String mensagemNaoDoar = "Ainda não tenho condições para doar.";
		*/
		
		//if - else
		/*if (salario > 5000) {
			mensagemResult = mensagemDoar;
		}else {
			mensagemResult = mensagemNaoDoar;
		}
		System.out.println(mensagemResult);
		*/
		
		//Operador Ternário
		String mensagemResult = (salario > 5000) ? "Eu vou doar X para o DevDojo." : "Ainda não tenho condições para doar.";
		System.out.println(mensagemResult);
	}
}
