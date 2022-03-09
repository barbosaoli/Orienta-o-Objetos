package products;

import model.Produto;

public class Oculos extends Produto{

	private String formato;
	private String tamanho;
	
	public Oculos(int idProduto, String nome, String cor, String categoria, String marca, int preco, String formato,
			String tamanho) {
		super(idProduto, nome, cor, categoria, marca, preco);
		this.formato = formato;
		this.tamanho = tamanho;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


		
	
}