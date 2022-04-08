package model;

public class Client extends Person {
	private String dataPrimC;
	private String endereco;
	

	
	public Client(String name, String endereco, String dataPrimC, int numID, String cPF, Telefone numTel) {
		super(name, numID, cPF, numTel);
		this.dataPrimC = dataPrimC;
		this.endereco = endereco;
	}

	public String getDataPrimC() {
		return dataPrimC;
	}

	public void setDataPrimC(String dataPrimC) {
		this.dataPrimC = dataPrimC;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

	
}