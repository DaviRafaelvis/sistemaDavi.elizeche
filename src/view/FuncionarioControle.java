/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Funcionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class FuncionarioControle extends AbstractTableModel {
     private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public Funcionario getBean(int row){
    return (Funcionario) lista.get(row);
    
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
        Funcionario funcionario = (Funcionario) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return funcionario.getIdFuncionario();
    }
        if (columnIndex == 1){
    return funcionario.getNome();
    }
        if (columnIndex == 2){
    return funcionario.getCpf();
    }
        if (columnIndex == 3){
    return funcionario.getCargo();
    }
       
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Nome";
    }
    if (column == 2){
    return "CPF";
    }
    if (column == 3){
    return "Cargo";
    }
   
    return "";
    
    }
}


