package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Compra {
  private int idcompra;
  private int id_fornecedor;
  private Date data_compra;
  private Double valor_total_compra;
  private String forma_pagamento;
  private int status_compra;
 
  
  public Compra(){
      
  }

    /**
     * @return the idcompra
     */
    public int getIdcompra() {
        return idcompra;
    }

    /**
     * @param idcompra the idcompra to set
     */
    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    /**
     * @return the id_fornecedor
     */
    public int getId_fornecedor() {
        return id_fornecedor;
    }

    /**
     * @param id_fornecedor the id_fornecedor to set
     */
    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    /**
     * @return the data_compra
     */
    public Date getData_compra() {
        return data_compra;
    }

    /**
     * @param data_compra the data_compra to set
     */
    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    /**
     * @return the valor_total_compra
     */
    public Double getValor_total_compra() {
        return valor_total_compra;
    }

    /**
     * @param valor_total_compra the valor_total_compra to set
     */
    public void setValor_total_compra(Double valor_total_compra) {
        this.valor_total_compra = valor_total_compra;
    }

    /**
     * @return the forma_pagamento
     */
    public String getForma_pagamento() {
        return forma_pagamento;
    }

    /**
     * @param forma_pagamento the forma_pagamento to set
     */
    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    /**
     * @return the status_compra
     */
    public int getStatus_compra() {
        return status_compra;
    }

    /**
     * @param status_compra the status_compra to set
     */
    public void setStatus_compra(int status_compra) {
        this.status_compra = status_compra;
    }

}
   