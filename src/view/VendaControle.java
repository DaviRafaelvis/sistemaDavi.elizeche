/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Venda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class VendaControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public Venda getBean(int row){
    return (Venda) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 4;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda venda = (Venda) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return venda.getIdvenda();
    }
        if (columnIndex == 1){
    return venda.getId_cliente();
    }
        if (columnIndex == 2){
    return venda.getId_vendedor();
    }
        if (columnIndex == 3){
    return venda.getValor_total_venda();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "Venda";
    }
    if (column == 1){
    return "Cliente";
    }
    if (column == 2){
    return "Vendedor";
    }
    if (column == 3){
    return "Valor da Venda";
    }
    return "";
    
    }

    
}
