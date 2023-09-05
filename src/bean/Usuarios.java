package bean;
import java.util.Date;
/**
 *
 * @author u10154925179
 */
public class Usuarios implements Comparable{
    private int idUsuarios;
    private String nome;
    private String apelido;
    private String cpf;
    private Date dataNascimento;
    private String senha;
    private int nivel;
    private String ativo;

    public Usuarios(){
    }
    /**
     * @return the idUsuarios
     */
    public int getIdUsuarios() {
        return idUsuarios;
    }

    /**
     * @param idUsuarios the idUsuarios to set
     */
    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
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
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    @Override
    public int compareTo(Object o) {
        Usuarios usuarios = (Usuarios) o;
        return this.apelido.toUpperCase().compareTo(usuarios.getApelido());
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
            }
