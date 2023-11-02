package com.felipe.ControleDeEstoque;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import controllers.StockController;
import file_IO.FileHandler;
import views.StockView;

class StockControllerTest {

    @Test
    void testAddProduct() {
        // Mock das dependências (FileHandler e StockView)
        FileHandler fileHandlerMock = Mockito.mock(FileHandler.class);
        
        StockView stockViewMock = Mockito.mock(StockView.class);

        // Criando uma instância de StockController com as dependências mockadas
        StockController stockController = new StockController(fileHandlerMock, stockViewMock);

        // Definindo o comportamento esperado quando o método escritaFile é chamado
        int id = 1;
        String produto = "Produto Teste";
        double preco = 10.0;
        int qtd = 5;
        Mockito.doNothing().when(fileHandlerMock).escritaFile(id, produto, preco, qtd);

        // Chamando o método que queremos testar
        stockController.addProduct(id, produto, preco, qtd);

        // Verificando se o método escritaFile foi chamado corretamente
        Mockito.verify(fileHandlerMock, Mockito.times(1)).escritaFile(id, produto, preco, qtd);
    }
}
