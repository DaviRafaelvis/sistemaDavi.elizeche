/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.util.Date;
/**
 *
 * @author rafae
 */
public class Produto {
  private int idProduto;
    private Double valor_unitario;
    private String categoria;
  private String descricao;
  private String colecao;

 
  
  public Produto(){
      
  }

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the colecao
     */
    public String getColecao() {
        return colecao;
    }

    /**
     * @param colecao the colecao to set
     */
    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String toString(){
    return getCategoria();
    }
    
};

   