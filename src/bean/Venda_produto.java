package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Venda_produto {
  private int idvenda_produto;
  private int id_produto;
  private Double quantidade;
  private Double valor_unitario;
 
 
public Venda_produto(){
}

    /**
     * @return the idvenda_produto
     */
    public int getIdvenda_produto() {
        return idvenda_produto;
    }

    /**
     * @param idvenda_produto the idvenda_produto to set
     */
    public void setIdvenda_produto(int idvenda_produto) {
        this.idvenda_produto = idvenda_produto;
    }

    /**
     * @return the id_venda
     */

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
     * @return the status_venda
     */
   
};