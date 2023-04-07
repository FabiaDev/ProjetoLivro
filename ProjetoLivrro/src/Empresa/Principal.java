package Empresa;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital Id = new LivroDigital("Senhor Dos Aneis ",
				new Autor("Tolkien", "Britanico", "Tolkien@gmail.com"),
				"Aventura",
				5,
				10000,
				3500);
		Id.info();
		

	}

}
