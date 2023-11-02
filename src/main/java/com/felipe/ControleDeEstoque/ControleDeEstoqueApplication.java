package com.felipe.ControleDeEstoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controllers.StockController;
import file_IO.FileHandler;
import views.StockView;

@SpringBootApplication
public class ControleDeEstoqueApplication {

	public static void main(String[] args) {
		   FileHandler fileHandler = new FileHandler();
	        StockView stockView = new StockView();
	        StockController stockController = new StockController(fileHandler, stockView);

	        // Adiciona um produto
	       // stockController.addProduct(128, "Playstation", 24.90, 2);

	        // Atualiza um produto
	       stockController.updateProduct(127, "Controle azul");

	        // Exibe os produtos
	       // stockController.displayProducts();
	    }
	}

	


