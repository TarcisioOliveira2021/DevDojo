package projetos.devDojo;

public class EstruturasCondicionais1 {
	public static void main(String[] args) {
		//if = se
		int idade = 15;
		boolean isAutorizadoComprarBebida = idade >= 18;
		
		if (isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcolica.");
		}else {
			System.out.println("N�o autorizado a comprar bebida alcolica.");
		}
		
		/*Forma de negar sem usar o else:
		if (isAutorizadoComprarBebida == false) {
			System.out.println("N�o autorizado a comprar bebida alcolica.");
		}
		  Outra Forma:
		*/
		if (!isAutorizadoComprarBebida) {
			System.out.println("N�o autorizado a comprar bebida alcolica.");
		}
		// if (true) System.out.println("Dentro do if");
		
		
		//IMPORTANTE :
		boolean c = false;
		if (c == true) {
			System.out.println("Agora ele � verdade e executa essa linha caso o C recebesse true antes e na condi��o recebese false ele n�o ia executar esse bloco interno. ");
		}
	}
}
