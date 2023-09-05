package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Cliente {
  private int idCliente;
  private String nome;
  private String email;
  private String cpf;
  private String cep;
   private String telefone;
   private String dados_pagamento;
   private String rg;
  private Date data_nascimento;
  private int sexo;
  private String cidade;
  private String bairro;
  private String celular;
  private String pais;
  private String apelido;
  
  public Cliente(){
};

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
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
     * @return the dados_pagamento
     */
    public String getDados_pagamento() {
        return dados_pagamento;
    }

    /**
     * @param dados_pagamento the dados_pagamento to set
     */
    public void setDados_pagamento(String dados_pagamento) {
        this.dados_pagamento = dados_pagamento;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the dataNascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the dataNascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the pais to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public String toString(){
    return getIdCliente() + " - " + getNome();
    }
    
    public boolean equals(Object object){
        if (object instanceof Cliente){
        Cliente cliente = (Cliente) object;
        if (this.getIdCliente() == cliente.getIdCliente()) {
        return true;
        }
        }
    
    return false;
    }
}