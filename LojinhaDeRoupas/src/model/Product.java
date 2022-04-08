package model;

/**
 * Classe-pai de todos os objetos de venda da loja
 * @author Lucas & Gustavo
 * @version 1.0 (abril 2022)
 */
public abstract class Product {
	private int idProduto;
	private String nome;
	private String cor;
	private String categoria;
	private String marca;
	private String tamanho;
	private int preco;
	
	/**
	 * Definir os parametros de Product
	 * @param idProduto
	 * @param nome
	 * @param cor
	 * @param categoria
	 * @param marca
	 * @param tamanho
	 * @param preco
	 */
	public Product(int idProduto, String nome, String cor, String categoria, String marca, String tamanho, int preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.cor = cor;
		this.categoria = categoria;
		this.marca = marca;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getIdProduto() {
		return idProduto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	} 
	
	
	
	

}