package aplicacao;

import entidades.Lista;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		// adicionar os produtos na lista
		/*
		 * verificacao de duplicados: verifica se tem algum produto com o mesmo binomio (nome,preco) na lista.
		 * Se tiver, ele nao adiciona
		 */
		lista.addProduto(new Produto("TV", 1200.0f));
		lista.addProduto(new Produto("Boneca", 120.0f));
		lista.addProduto(new Produto("Boneca", 120.0f));
		lista.addProduto(new Produto("Geladeria", 4500.0f));
		lista.addProduto(new Produto("Tablet", 5265.6f));
		
		lista.mostarLista();
		
		lista.ordenarLista();
		
		System.out.println("\nLista ordenada[nome]:");
		lista.mostarLista();
	}

}
