package projetos.devDojo;

public class EstruturasCondicionais3 {
	public static void main(String[] args) {
		double salario = 6000;
		// Doar se o salario > 5000;
		
		/*String mensagemDoar = "Eu vou doar X para o DevDojo.";
		String mensagemNaoDoar = "Ainda n�o tenho condi��es para doar.";
		*/
		
		//if - else
		/*if (salario > 5000) {
			mensagemResult = mensagemDoar;
		}else {
			mensagemResult = mensagemNaoDoar;
		}
		System.out.println(mensagemResult);
		*/
		
		//Operador Tern�rio
		String mensagemResult = (salario > 5000) ? "Eu vou doar X para o DevDojo." : "Ainda n�o tenho condi��es para doar.";
		System.out.println(mensagemResult);
	}
}
