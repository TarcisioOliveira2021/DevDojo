package projetos.devDojo;

public class EstruturasCondicionais2 {

	public static void main(String[] args) {
		// idade < 15 catergoria infantil
		// idade >= 15 &&  idade < 18 catergiria juvenil
		// idade > 18 catergoria adulto

		int idade = 15;
		String catergoria;
	/*	
		if (idade < 15) {
			catergoria = "Catergoria infantil";
		}else if (idade >=15 && idade < 18) {
			catergoria = "Catergoria juvenil";
		}else {
			catergoria = "Catergoria adulto";
		}
		System.out.println(catergoria);
	*/
		
	// Usando o operador ternario (Nunca deve-se usar no mundo real ).
	catergoria = idade < 15 ? "Catergoria infantil" : idade >= 15 && idade < 18 ? "Catergoria juvenil" : "Catergoria adulto";
	System.out.println(catergoria);
		
	}
}
