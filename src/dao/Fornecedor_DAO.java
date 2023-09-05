/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Fornecedor;
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
public class Fornecedor_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Fornecedor fornecedor = (Fornecedor) object;
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

             String sql = "insert into fornecedor values(?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, fornecedor.getIdfornecedor());
              pstm.setString(2, fornecedor.getNome());
              pstm.setString(3, fornecedor.getEmail());
              pstm.setString(4, fornecedor.getTelefone());
             pstm.setString(5, fornecedor.getCnpj());
             pstm.setString(6, fornecedor.getEndereco());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
          Fornecedor fornecedor = new Fornecedor();
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

             String sql = "select * from fornecedor where idfornecedor=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                fornecedor.setIdfornecedor(rs.getInt("idfornecedor"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEndereco(rs.getString("endereco"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return fornecedor;
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

             String sql = "select * from fornecedor";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setIdfornecedor(rs.getInt("idfornecedor"));
                fornecedor.setNome(rs.getString("nome"));
                  fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEndereco(rs.getString("endereco"));
             
              
                lista.add(fornecedor);
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
      
       Fornecedor fornecedor = (Fornecedor) object;
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

             String sql = "update fornecedor set nome=?,email=?, telefone=?, cnpj=?,endereco=? where idfornecedor=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(6, fornecedor.getIdfornecedor());
              pstm.setString(1, fornecedor.getNome());
              pstm.setString(2, fornecedor.getEmail());
              pstm.setString(3, fornecedor.getTelefone());
             pstm.setString(4, fornecedor.getCnpj());
             pstm.setString(5, fornecedor.getEndereco());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    
    }

    @Override
    public void delete(Object object) {
        Fornecedor fornecedor= (Fornecedor) object;
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

             String sql = "delete from fornecedor where id_fornecedor=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, fornecedor.getIdfornecedor());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

          } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setIdfornecedor(8);
        fornecedor.setNome("gabriela bolsonaro");
        fornecedor.setEmail("juntacombolsonaro@gmail.com");
        fornecedor.setTelefone("66667777");
        fornecedor.setCnpj("1299009");
        fornecedor.setEndereco("residencial");
        
        Fornecedor_DAO fornecedor_DAO = new Fornecedor_DAO();
        fornecedor_DAO.insert(fornecedor);
        
        System.out.println("deu certo");
    }
    
}
