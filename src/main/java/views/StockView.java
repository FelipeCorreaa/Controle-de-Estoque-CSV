package views;

import entities.Product;
import java.util.List;

public class StockView {
	/**
	 * Exibe os produtos na view.
	 * @param products A lista de produtos a ser exibida.
	 */
    public void displayProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
    /**
     * Exibe uma mensagem na view.
     * @param message A mensagem a ser exibida.
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
