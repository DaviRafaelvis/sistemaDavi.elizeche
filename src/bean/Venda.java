package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Venda {
  private int idvenda;
  private int id_cliente;
  private int id_vendedor;
  private Double valor_total_venda;
  private Date data_venda;
 
public Venda(){
}

    /**
     * @return the idvenda
     */
    public int getIdvenda() {
        return idvenda;
    }

    /**
     * @param idvenda the idvenda to set
     */
    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_vendedor
     */
    public int getId_vendedor() {
        return id_vendedor;
    }

    /**
     * @param id_vendedor the id_vendedor to set
     */
    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    /**
     * @return the valor_total_venda
     */
    public Double getValor_total_venda() {
        return valor_total_venda;
    }

    /**
     * @param valor_total_venda the valor_total_venda to set
     */
    public void setValor_total_venda(Double valor_total_venda) {
        this.valor_total_venda = valor_total_venda;
    }

    /**
     * @return the data_venda
     */
    public Date getData_venda() {
        return data_venda;
    }

    /**
     * @param data_venda the data_venda to set
     */
    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }
}

