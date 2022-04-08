package model;

/**
 * Classe-pai da Loja
 * @author Lucas & Gustavo
 * @version 1.0 (abril 2022)
 */
public class Store {

    private String nomeLoja;
    private String endereco;
    private int cep;
    private Telefone telefone;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    /**
     * Controlador de Loja
     * @param nomeLoja
     * @param endereco
     * @param cep
     * @param telefone
     */
    public Store(String nomeLoja, String endereco, int cep, Telefone telefone) {
        this.nomeLoja = nomeLoja;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nomeLoja;
    }

}