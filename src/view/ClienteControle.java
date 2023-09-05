/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ClienteControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public Cliente getBean(int row){
    return (Cliente) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 5;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = (Cliente) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return cliente.getIdCliente();
    }
        if (columnIndex == 1){
    return cliente.getNome();
    }
        if (columnIndex == 2){
    return cliente.getApelido();
    }
        if (columnIndex == 3){
    return cliente.getCpf();
    }
        if (columnIndex == 4){
    return cliente.getCep();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Nome";
    }
    if (column == 2){
    return "Apelido";
    }
    if (column == 3){
    return "CPF";
    }
    if (column == 4){
    return "CEP";
    }
    return "";
    
    }
}


