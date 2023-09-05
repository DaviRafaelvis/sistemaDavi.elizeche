/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class VendedorControle extends AbstractTableModel {
 
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public Vendedor getBean(int row){
    return (Vendedor) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 4;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vendedor vendedor = (Vendedor) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return vendedor.getIdVendedor();
    }
        if (columnIndex == 1){
    return vendedor.getId_funcionario();
    }
        if (columnIndex == 2){
    return vendedor.getNome();
    }
        if (columnIndex == 3){
    return vendedor.getCpf();
    }
     
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "Vendedor";
    }
    if (column == 1){
    return "Funcionário";
    }
    if (column == 2){
    return "Nome";
    }
    if (column == 3){
    return "CPF";
    }
   
    return "";
    
    }
    
}
