/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import bean.Compra_produto;
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
public class Compra_produto_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Compra_produto compra_produto = (Compra_produto) object;
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

             String sql = "insert into compra_produto values(?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compra_produto.getIdcompra_produto());
              pstm.setInt(2, compra_produto.getId_produto());
              pstm.setDouble(3, compra_produto.getQuantidade());
              pstm.setDouble(4, compra_produto.getValor_unitario());
              pstm.setString(5, compra_produto.getStatus_compra());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Compra_produto_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Compra_produto_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
           Compra_produto compra_produto = new  Compra_produto();
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

             String sql = "select * from compra_produto where idcompra_produto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                compra_produto.setIdcompra_produto(rs.getInt("idcompra_produto"));
                compra_produto.setId_produto(rs.getInt("Id_produto"));
                compra_produto.setQuantidade(rs.getDouble("quantidade"));
                compra_produto.setValor_unitario(rs.getDouble("valor_unitario"));
                compra_produto.setStatus_compra(rs.getString("status_compra"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return compra_produto;
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

             String sql = "select * from compra_produto";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Compra_produto compra_produto = new Compra_produto();
                compra_produto.setIdcompra_produto(rs.getInt("idvenda_produto"));
                compra_produto.setId_produto(rs.getInt("id_produto"));
                  compra_produto.setQuantidade(rs.getDouble("quantidade"));
                compra_produto.setValor_unitario(rs.getDouble("valor_unitario"));
                compra_produto.setStatus_compra(rs.getString("status_compra"));
             
              
                lista.add(compra_produto);
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
      Compra_produto compra_produto = (Compra_produto) object;
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

             String sql = "update compra_produto set id_produto=?, quantidade=?, valor_unitario=?, idcompra_produto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(4, compra_produto.getIdcompra_produto());
              pstm.setInt(1, compra_produto.getId_produto());
              pstm.setDouble(2, compra_produto.getQuantidade());
              pstm.setDouble(3, compra_produto.getValor_unitario());
             
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
         Compra_produto compra_produto = (Compra_produto) object;
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

             String sql = "delete from compra_produto where idcompra_produto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compra_produto.getIdcompra_produto());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Compra_produto compra_produto = new Compra_produto();
        compra_produto.setIdcompra_produto(3);
        compra_produto.setId_produto(5);
       compra_produto.setQuantidade(4.1);
       compra_produto.setValor_unitario(5.1);
       compra_produto.setStatus_compra("C");
       
       
        
        Compra_produto_DAO compra_produto_DAO = new Compra_produto_DAO();
        compra_produto_DAO.insert(compra_produto);
        
        System.out.println("INSERIDO");
    }
    
}
