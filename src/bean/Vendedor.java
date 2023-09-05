package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Vendedor {
  public int idVendedor;
  public int id_funcionario;
  public String nome;
  public String email;
  public String cpf;
  public Date dataNascimento;
  public String telefone;
  
  public Vendedor(){
};

    /**
     * @return the idVendedor
     */
    public int getIdVendedor() {
        return idVendedor;
    }

    /**
     * @param idVendedor the idVendedor to set
     */
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    /**
     * @return the idFuncionario
     */
    public int getId_funcionario() {
        return id_funcionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setId_funcionario(int idFuncionario) {
        this.id_funcionario = idFuncionario;
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
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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
     public String toString(){
         
    return getIdVendedor() + " - " + getNome();
    }
     
      public boolean equals(Object object){
        if (object instanceof Vendedor){
        Vendedor vendedor = (Vendedor) object;
        if (this.getIdVendedor() == vendedor.getIdVendedor()) {
        return true;
        }
        }
    
    return false;
    }
}
    