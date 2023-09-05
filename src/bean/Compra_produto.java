package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Compra_produto {
  private int idcompra_produto;
  private int id_produto;
  private Double quantidade;
  private Double valor_unitario;
  private String status_compra;
  
 
  
  public Compra_produto(){
  }

    /**
     * @return the idcompra_produto
     */
    public int getIdcompra_produto() {
        return idcompra_produto;
    }

    /**
     * @param idcompra_produto the idcompra_produto to set
     */
    public void setIdcompra_produto(int idcompra_produto) {
        this.idcompra_produto = idcompra_produto;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the quantidade
     */
    public Double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor_unitario
     */
    public Double getValor_unitario() {
        return valor_unitario;
    }

    /**
     * @param valor_unitario the valor_unitario to set
     */
    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    /**
     * @return the status_compra
     */
    public String getStatus_compra() {
        return status_compra;
    }

    /**
     * @param status_compra the status_compra to set
     */
    public void setStatus_compra(String status_compra) {
        this.status_compra = status_compra;
    }}

  