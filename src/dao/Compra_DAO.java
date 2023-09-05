/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Compra;
import dao.DAO_Abstract;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u10154925179
 */
public class Compra_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Compra compra = (Compra) object;
        String url, user, password;

       
         
       url = "jdbc:mysql://10.7.0.51:33062/db_davi_elizeche";
        user = "davi_elizeche";
        password = "davi_elizeche";
        
        
          //url = "jdbc:mysql://localhost:3306/db_davielizeche";
         //user = "root";
         //password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            //Statement stm;
            //stm = cnt.createStatement();

             String sql = "insert into compra values(?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compra.getIdcompra());
              pstm.setInt(2, compra.getId_fornecedor());
             pstm.setDate(3, new java.sql.Date (compra.getData_compra().getTime()));
              pstm.setDouble(4, compra.getValor_total_compra());
              pstm.setString(5, compra.getForma_pagamento());
              pstm.setInt(6, compra.getStatus_compra());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Compra_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Compra_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
        Compra compra = new Compra();
        String url, user, password;

       
         
           url = "jdbc:mysql://10.7.0.51:33062/db_davi_elizeche";
        user = "davi_elizeche";
        password = "davi_elizeche";
        
        
          //url = "jdbc:mysql://localhost:3306/db_davielizeche";
         //user = "root";
         //password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            //Statement stm;
            //stm = cnt.createStatement();

             String sql = "select * from compra where idcompra=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                compra.setIdcompra(rs.getInt("idcompra"));
                compra.setId_fornecedor(rs.getInt("id_fornecedor"));
                 compra.setData_compra(rs.getDate("data_compra"));
                compra.setForma_pagamento(rs.getString("forma_pagamento"));
                compra.setValor_total_compra(rs.getDouble("valor_total_compra"));
                compra.setStatus_compra(rs.getInt("status_compra"));
                
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return compra;
    
    }

    @Override
    public java.util.List listALL() {
       String url, user, password;
        
         
          url = "jdbc:mysql://10.7.0.51:33062/db_davi_elizeche";
        user = "davi_elizeche";
        password = "davi_elizeche";
        
        
          //url = "jdbc:mysql://localhost:3306/db_davielizeche";
         //user = "root";
         //password = "";
          List lista = new ArrayList();
        
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            //Statement stm;
            //stm = cnt.createStatement();

             String sql = "select * from compra";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Compra compra = new Compra();
                compra.setIdcompra(rs.getInt("idcompra"));
                compra.setId_fornecedor(rs.getInt("id_fornecedor"));
                compra.setData_compra(rs.getDate("data_compra"));
                compra.setForma_pagamento(rs.getString("forma_pagamento"));
                compra.setValor_total_compra(rs.getDouble("valor_total_compra"));
                compra.setStatus_compra(rs.getInt("status_compra"));
             
              
                lista.add(compra);
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return lista;
    }

    @Override
    public void update(Object object) {
         Compra compra = (Compra) object;
        String url, user, password;

       
        
           url = "jdbc:mysql://10.7.0.51:33062/db_davi_elizeche";
        user = "davi_elizeche";
        password = "davi_elizeche";
        
        
          //url = "jdbc:mysql://localhost:3306/db_davielizeche";
         //user = "root";
         //password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            //Statement stm;
            //stm = cnt.createStatement();

             String sql = "update compra set id_fornecedor=?,data_compra=?, forma_pagamento=?, valor_total_compra=?, status_compra=? where idcompra=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(6, compra.getIdcompra());
              pstm.setInt(1, compra.getId_fornecedor());
             pstm.setDate(2, new java.sql.Date (compra.getData_compra().getTime()));
              pstm.setString(3, compra.getForma_pagamento());
              pstm.setDouble(4, compra.getValor_total_compra());
              pstm.setInt(5, compra.getStatus_compra());
             
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }    }

    @Override
    public void delete(Object object) {
        Compra compra = (Compra) object;
        String url, user, password;

        
           url = "jdbc:mysql://10.7.0.51:33062/db_davi_elizeche";
        user = "davi_elizeche";
        password = "davi_elizeche";
        
        
          //url = "jdbc:mysql://localhost:3306/db_davielizeche";
         //user = "root";
         //password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            //Statement stm;
            //stm = cnt.createStatement();

             String sql = "delete from compra where idcompra=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compra.getIdcompra());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.setIdcompra(6);
        compra.setId_fornecedor(3);
       //compra.setData_compra(20030705);
       compra.setValor_total_compra(10.2);
       compra.setForma_pagamento("Pix");
       compra.setStatus_compra(1);
       
       
        
        Compra_DAO compra_DAO = new Compra_DAO();
        compra_DAO.insert(compra);
        
        System.out.println("deu certo");
    }
    
}
