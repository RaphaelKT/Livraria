
class Livraria {
	public static void main(String[]args){
		//Primeiro Livro
		Livros livro1 = new Livros();
		livro1.nome = "Adalberto";
		livro1.valor = 30.15;
			livro1.declararNV();
			
		//Segundo Livro
		Livros livro2 = new Livros();
		livro2.nome = "Java8";
		livro2.valor = 33;
			livro2.declararNV();
		System.out.println(livro1.valor+livro2.valor);
	}
}
