/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Funcionario;
import bean.Usuarios;
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
public class Funcionario_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Funcionario funcionario = (Funcionario) object;
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

             String sql = "insert into funcionario values(?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, funcionario.getIdFuncionario());
              pstm.setString(2, funcionario.getNome());
              pstm.setString(3, funcionario.getEmail());
              pstm.setString(4, funcionario.getTelefone());
             pstm.setString(5, funcionario.getCpf());
             pstm.setInt(6, funcionario.getCargo());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Funcionario_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Funcionario_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
       Funcionario funcionario = new Funcionario();
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

             String sql = "select * from funcionario where idFuncionario=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCargo(rs.getInt("cargo"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return funcionario;
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

             String sql = "select * from funcionario";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNome(rs.getString("nome"));
                  funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCargo(rs.getInt("cargo"));
             
              
                lista.add(funcionario);
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
       Funcionario funcionario = (Funcionario) object;
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

             String sql = "update funcionario set nome=?,email=?,telefone=?," + "cpf=?,cargo=? where idFuncionario=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(6, funcionario.getIdFuncionario());
              pstm.setString(1, funcionario.getNome());
              pstm.setString(2, funcionario.getEmail());
              pstm.setString(3, funcionario.getTelefone());
             pstm.setString(4, funcionario.getCpf());
             pstm.setInt(5, funcionario.getCargo());
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
        Funcionario funcionario = (Funcionario) object;
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

             String sql = "delete from funcionario where idFuncionario=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, funcionario.getIdFuncionario());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }


    }
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(5);
        funcionario.setNome("Picanha Conservada");
        funcionario.setEmail("fazoL@gmail.com");
        funcionario.setTelefone("737373");
        funcionario.setCpf("1299009");
        funcionario.setCargo(1);
        
        Funcionario_DAO funcionario_DAO = new Funcionario_DAO();
        funcionario_DAO.insert(funcionario);
    
        System.out.println("deu certo");
    }}
   