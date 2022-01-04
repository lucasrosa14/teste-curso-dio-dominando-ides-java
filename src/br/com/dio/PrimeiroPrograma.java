package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		System.out.println(gato);
		
		Livro livro = new Livro();
		System.out.println(livro);
	}

}

class Livro{
	private String nome;
	private int npag;
}