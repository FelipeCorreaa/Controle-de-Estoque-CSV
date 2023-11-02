package file_IO;

import java.util.List;

import entities.Product;

public interface FileIO {
    List<Product> leituraFile();
    void escritaFile(int id, String nome, double preco, int quantidade);
    void atualizarProduto(int id, String novoNome);
    void escreverNoArquivo();
}
