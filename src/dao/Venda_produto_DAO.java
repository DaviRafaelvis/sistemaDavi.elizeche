/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Venda_produto;
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
public class Venda_produto_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Venda_produto venda_produto = (Venda_produto) object;
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

             String sql = "insert into venda_produto values(?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda_produto.getIdvenda_produto());
             pstm.setInt(2, venda_produto.getId_produto());
             pstm.setDouble(3, venda_produto.getQuantidade());
             pstm.setDouble(4, venda_produto.getValor_unitario());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Venda_produto_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Venda_produto_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
       Venda_produto venda_produto = new Venda_produto();
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

             String sql = "select * from venda_produto where idvenda_produto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                venda_produto.setIdvenda_produto(rs.getInt("idUsuarios"));
                venda_produto.setId_produto(rs.getInt("Id_produto"));
                venda_produto.setQuantidade(rs.getDouble("quantidade"));
                venda_produto.setValor_unitario(rs.getDouble("valor_unitario"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return venda_produto;
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

             String sql = "select * from venda_produto";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Venda_produto venda_produto = new Venda_produto();
                venda_produto.setIdvenda_produto(rs.getInt("idvenda_produto"));
                venda_produto.setId_produto(rs.getInt("id_produto"));
                  venda_produto.setQuantidade(rs.getDouble("quantidade"));
                venda_produto.setValor_unitario(rs.getDouble("valor_unitario"));
             
              
                lista.add(venda_produto);
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
         Venda_produto venda_produto = (Venda_produto) object;
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

             String sql = "update venda_produto set idProduto=?, quantidade=?, valor_unitario=? where idvenda_produto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(4, venda_produto.getIdvenda_produto());
              pstm.setInt(1, venda_produto.getId_produto());
              pstm.setDouble(2, venda_produto.getQuantidade());
              pstm.setDouble(3, venda_produto.getValor_unitario());
             
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
         Venda_produto venda_produto = (Venda_produto) object;
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

             String sql = "delete from venda_produto where idvenda_produto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, venda_produto.getIdvenda_produto());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Venda_produto venda_produto = new Venda_produto();
        venda_produto.setIdvenda_produto(9);
        venda_produto.setId_produto(6);
         venda_produto.setQuantidade(10.0);
       venda_produto.setValor_unitario(15.0);
     
       
       
       
        
        Venda_produto_DAO venda_produto_DAO = new Venda_produto_DAO();
        venda_produto_DAO.insert(venda_produto);
        
        System.out.println("deu certo");
    }
    
}
