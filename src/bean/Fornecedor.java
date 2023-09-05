package bean;

import java.util.Date;

/**
 *
 * @author u10154925179
 */
public class Fornecedor {

    private int idfornecedor;
    private String nome;
    private String email;
    private String telefone;
    private String cnpj;
    private String endereco;

    public Fornecedor() {

    
}

    /**
     * @return the id_fornecedor
     */
    public int getIdfornecedor() {
        return idfornecedor;
    }

    /**
     * @param idfornecedor the id_fornecedor to set
     */
    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String toString(){
    return getIdfornecedor() + " - " + getNome();
    }
    public boolean equals(Object object){
        if (object instanceof Fornecedor){
        Fornecedor fornecedor = (Fornecedor) object;
        if (this.getIdfornecedor() == fornecedor.getIdfornecedor()) {
        return true;
        }
        }
    
    return false;
    }
}