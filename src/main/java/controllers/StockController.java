package controllers;

import entities.Product;
import file_IO.FileHandler;
import views.StockView;

public class StockController {
    private FileHandler fileHandler;
    private StockView stockView;
    
    public StockController() {
    	
    }

    public StockController(FileHandler fileHandler, StockView stockView) {
        this.fileHandler = fileHandler;
        this.stockView = stockView;
    }

    public void addProduct(int id, String produto, double preco, int qtd) {
        fileHandler.escritaFile(id, produto, preco, qtd);
    }

    public void updateProduct(int id, String novoNome) {
        fileHandler.atualizarProduto(id, novoNome);
    }

    public void displayProducts() {
        stockView.displayProducts(fileHandler.leituraFile());
    }
}
