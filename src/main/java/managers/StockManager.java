package managers;

import file_IO.FileHandler;
/**
 * Controlador de estoque.
 */
public class StockManager extends FileHandler{
	FileHandler escrita = new FileHandler();
	
	/**
	 * Adiciona um novo produto.
	 * @param id O ID do produto.
	 * @param produto O nome do produto.
	 * @param preco O preço do produto.
	 * @param qtd A quantidade do produto.
	 */
	public void  addProduct(int id, String produto , double preco ,int qtd) {
	
		escrita.escritaFile(id, produto,preco, qtd);
		
	}
	/**
	 * Atualiza o nome de um produto.
	 * @param id O ID do produto a ser atualizado.
	 * @param novoNome O novo nome do produto.
	 */
	public void atualizarProduto(int id, String novoNome) {
		escrita.atualizarProduto(id, novoNome);
	}
	/**
	 * Exibe os produtos na view.
	 * @param products A lista de produtos a ser exibida.
	 */
	public void lerProdutos () {
		escrita.leituraFile();
	}
	
}
