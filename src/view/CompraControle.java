/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Compra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class CompraControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public Compra getBean(int row){
    return (Compra) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 4;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Compra compra = (Compra) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return compra.getIdcompra();
    }
        if (columnIndex == 1){
    return compra.getId_fornecedor();
    }
        if (columnIndex == 2){
    return compra.getData_compra();
    }
        if (columnIndex == 3){
    return compra.getValor_total_compra();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "Compra";
    }
    if (column == 1){
    return "Fornecedor";
    }
    if (column == 2){
    return "Data";
    }
    if (column == 3){
    return "Valor da Compra";
    }
    return "";
    
    }

    
}
