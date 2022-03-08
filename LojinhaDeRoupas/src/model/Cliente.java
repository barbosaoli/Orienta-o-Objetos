package model;

public class Cliente extends Pessoa {
	private int idCliente;
	private int valorGasto;
	private String favoritos;
	
	public Cliente(String nome, String email, String endereco, String cpf, String telefone, int idCliente,
			int valorGasto, String favoritos) {
		
		super(nome, email, endereco, cpf, telefone);
		
		this.idCliente = idCliente;
		this.valorGasto = valorGasto;
		this.favoritos = favoritos;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(int valorGasto) {
		this.valorGasto = valorGasto;
	}

	public String getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(String favoritos) {
		this.favoritos = favoritos;
	}

	

}