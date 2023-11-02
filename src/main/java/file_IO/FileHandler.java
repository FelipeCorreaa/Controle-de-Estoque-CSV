package file_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Product;
/**
 * Manipula a leitura e escrita de produtos em um arquivo.
 */

public class FileHandler implements FileIO {

	private Map<Integer, Product> produtos = new HashMap<>();
	/**
	 * Lê os produtos de um arquivo e os armazena em uma lista.
	 * @return A lista de produtos lidos do arquivo.
	 */
	@Override
	public List<Product> leituraFile() { 
		List<Product> listProd = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\in.txt"))) {
			String linha = reader.readLine();
			while (linha != null) {
				String[] divisor = linha.split(",");//Faz o tratamento da linha reconhecendo a "," como separador do vetor
				int id = Integer.parseInt(divisor[0].split(":")[1].trim());
				String nome = divisor[1].split(":")[1].trim();
				double preco = Double.parseDouble(divisor[2].split(":")[1].trim());
				int quantidade = Integer.parseInt(divisor[3].split(":")[1].trim());
				Product produto = new Product(id, nome, preco, quantidade);
				listProd.add(produto);
				produtos.put(id, produto);
				linha = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Formato inválido no arquivo: " + e.getMessage());
		}
		return listProd;
	}

	/**
	 * Faz a escrita de um novo componente no arquivo.
	 * @param id O ID do produto.
	 * @param nome O nome do produto.
	 * @param preco O preço do produto.
	 * @param quantidade A quantidade do produto.
	 */

	@Override
	public void escritaFile(int id, String nome, double preco, int quantidade) {
		try (FileWriter escrita = new FileWriter("C:\\Java\\in.txt", true)) {

			escrita.write("ID:" + id + ",nome:" + nome + ",preco:" + preco + ",quantidade:" + quantidade + "\n");
			System.out.println("Texto foi adicionado ao arquivo com sucesso.");

			escrita.close();
		} catch (IOException e) {
	        System.out.println("Erro ao adicionar ao arquivo: " + e.getMessage());
	    }
	}

	/**
	 * Atualiza o nome de um produto no arquivo.
	 * @param id O ID do produto a ser atualizado.
	 * @param novoNome O novo nome do produto.
	 */
	@Override
	public void atualizarProduto(int id, String novoNome) {
		leituraFile();
		Product produto = produtos.get(id);
		if (produto != null) {
			produto.setNome(novoNome);
			escreverNoArquivo();
		} else {
			System.out.println("Produto não existe");
		}
	}

	/**
	 * Escreve o novo arquivo atualizado.
	 */
	@Override
	public void escreverNoArquivo() {
		try (FileWriter writer = new FileWriter("C:\\Java\\in.txt")) {
			for (Product produto : produtos.values()) {
				writer.write(produto.toFileString() + "\n");
			}
			System.out.println("Texto foi adicionado ao arquivo com sucesso.");
		} catch (IOException e) {
			System.out.println("Erro ao atualizar produto"+e.getLocalizedMessage());
		}
	}
}