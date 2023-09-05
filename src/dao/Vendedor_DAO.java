/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao; 

import bean.Funcionario;
import bean.Vendedor;
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
 * @author rafae
 */
public class Vendedor_DAO extends DAO_Abstract{
    
     @Override
    public void insert(Object object) {
        Vendedor vendedor = (Vendedor) object;
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

             String sql = "insert into vendedor values(?,?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendedor.getIdVendedor());
            pstm.setInt(2, vendedor.getId_funcionario());
              pstm.setString(3, vendedor.getNome());
              pstm.setString(4, vendedor.getEmail());
              pstm.setString(5, vendedor.getCpf());
               pstm.setDate(6, new java.sql.Date (vendedor.getDataNascimento().getTime()));
             pstm.setString(7, vendedor.getTelefone());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vendedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Vendedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
       Vendedor vendedor = new Vendedor();
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

             String sql = "select * from vendedor where idvendedor=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                vendedor.setIdVendedor(rs.getInt("idvendedor"));
                vendedor.setId_funcionario(rs.getInt("id_funcionario"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setEmail(rs.getString("email"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setDataNascimento(rs.getDate("dataNascimento"));
                vendedor.setTelefone(rs.getString("telefone"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return vendedor;
    
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

             String sql = "select * from vendedor";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Vendedor vendedor = new Vendedor();
                vendedor.setIdVendedor(rs.getInt("idVendedor"));
                vendedor.setId_funcionario(rs.getInt("id_funcionario"));
                vendedor.setNome(rs.getString("nome"));
                  vendedor.setEmail(rs.getString("email"));
                  vendedor.setCpf(rs.getString("cpf"));
                  vendedor.setDataNascimento(rs.getDate("dataNascimento"));
                vendedor.setTelefone(rs.getString("telefone"));
                
                
             
              
                lista.add(vendedor);
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
        Vendedor vendedor = (Vendedor) object;
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

             String sql = "update vendedor set idFuncionario=?,nome=?,email=?,cpf=?,dataNascimento=?,telefone=? where idVendedor=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
             pstm.setInt(7, vendedor.getIdVendedor());
             pstm.setInt(1, vendedor.getId_funcionario());
             pstm.setString(2, vendedor.getNome());
             pstm.setString(3, vendedor.getEmail());
             pstm.setString(4, vendedor.getCpf());
             pstm.setDate(5, new java.sql.Date (vendedor.getDataNascimento().getTime()));
             pstm.setString(6, vendedor.getTelefone());
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
        Vendedor vendedor = (Vendedor) object;
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

             String sql = "delete from vendedor where idVendedor=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendedor.getIdVendedor());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.setIdVendedor(1);
        vendedor.setId_funcionario(1);
        vendedor.setNome("Davi");
        vendedor.setEmail("rafaeldavi503@gmail.com");
        vendedor.setCpf("101.549.251-79");
        //vendedor.setDataNascimento("");
        vendedor.setTelefone("91369117");
        
        Vendedor_DAO vendedor_DAO = new Vendedor_DAO();
        vendedor_DAO.insert(vendedor);
        
        System.out.println("deu certo");
    }
    
}