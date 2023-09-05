/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ProdutoControle extends AbstractTableModel {
     private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public Produto getBean(int row){
    return (Produto) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 5;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = (Produto) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return produto.getIdProduto();
    }
        if (columnIndex == 1){
    return produto.getValor_unitario();
    }
        if (columnIndex == 2){
    return produto.getCategoria();
    }
        if (columnIndex == 3){
    return produto.getColecao();
    }
       
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Valor";
    }
    if (column == 2){
    return "Categoria";
    }
    if (column == 3){
    return "Colecao";
    }
   
    return "";
    
    } 
    
}
