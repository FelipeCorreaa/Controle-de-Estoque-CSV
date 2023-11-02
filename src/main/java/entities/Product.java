package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
/**
 * Entidades do produto 
 */
public class Product {
	private Integer id;
	private String nome;
	private Double preco;
	private Integer quantidade ;
	


	

	
	
	
	public Product(Integer id, String nome, Double preco, Integer quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco, quantidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco)
				&& Objects.equals(quantidade, other.quantidade);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID Produto: "+getId()+" , Produto: "+ getNome()+ " , Preço: R$:"+getPreco()+" , Quantidade : " + getQuantidade();
	}
	
	public String toFileString() {
	    return "ID:" + id + ",nome:" + nome + ",preco:" + preco + ",quantidade:" + quantidade;
	}



}
