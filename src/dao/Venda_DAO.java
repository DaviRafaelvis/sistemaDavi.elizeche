/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Venda;
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
public class Venda_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Venda venda = (Venda) object;
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

             String sql = "insert into venda values(?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getIdvenda());
             pstm.setInt(2, venda.getId_cliente());
             pstm.setInt(3, venda.getId_vendedor());
             pstm.setDate(4, new java.sql.Date (venda.getData_venda().getTime()));
             pstm.setDouble(5, venda.getValor_total_venda());
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
      Venda venda = new Venda();
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

             String sql = "select * from venda where idVenda=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
               venda.setIdvenda(rs.getInt("idvenda"));
                venda.setId_cliente(rs.getInt("id_cliente"));
                venda.setId_vendedor(rs.getInt("id_vendedor"));
                venda.setData_venda(rs.getDate("data_venda"));
                venda.setValor_total_venda(rs.getDouble("valor_total_venda"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return venda;
   
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

             String sql = "select * from venda";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Venda venda = new Venda();
                venda.setIdvenda(rs.getInt("idvenda"));
                venda.setId_cliente(rs.getInt("id_cliente"));
                  venda.setId_vendedor(rs.getInt("id_vendedor"));
                    venda.setData_venda(rs.getDate("data_venda"));
                venda.setValor_total_venda(rs.getDouble("valor_total_venda"));
              
                lista.add(venda);
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
         Venda venda = (Venda) object;
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

             String sql = "update venda set id_cliente=?, id_vendedor=?, data_venda=?, valor_total_venda=? where idvenda=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(5, venda.getIdvenda());
              pstm.setInt(1, venda.getId_cliente());
              pstm.setInt(2, venda.getId_vendedor());
              pstm.setDate(3, new java.sql.Date (venda.getData_venda().getTime()));
              pstm.setDouble(4, venda.getValor_total_venda());
               
             
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    @Override
    public void delete(Object object) {
          Venda venda = (Venda) object;
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

             String sql = "delete from idvenda where idvenda=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda.getIdvenda());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.setIdvenda(9);
        venda.setId_cliente(7);
        venda.setId_vendedor(4);
         venda.setValor_total_venda(10.2);
       //venda.setData_compra(20030705);
      
       
       
        
        Venda_DAO venda_DAO = new Venda_DAO();
        venda_DAO.insert(venda);
        
        System.out.println("deu certo");
    }
    
}
