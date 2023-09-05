/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.Usuarios;
import dao.DAO_Abstract;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u10154925179
 */
public class Usuarios_DAO extends DAO_Abstract {
public Usuarios_DAO() {

    }

    public Usuarios ApelidoESenha(String apelido, String senha) {

        Usuarios usuarios = null;
        String url, user, password;

         
         url = "jdbc:mysql://10.7.0.51:33062/db_davi_elizeche";
        user = "davi_elizeche";
        password = "davi_elizeche";
        
        
          //url = "jdbc:mysql://localhost:3306/db_davielizeche";
         //user = "root";
         //password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "select * from usuarios where apelido = ? and senha = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, apelido);
            pstm.setString(2, senha);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                usuarios = new Usuarios();
                usuarios.setNome(rs.getString("apelido"));
                usuarios.setSenha(rs.getString("senha"));
            }

            rs.close();
            pstm.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;
    }

    
    @Override
    public void insert(Object object) {
        Usuarios usuarios = (Usuarios) object;
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

             String sql = "insert into usuarios values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, usuarios.getIdUsuarios());
              pstm.setString(2, usuarios.getNome());
              pstm.setString(3, usuarios.getApelido());
              pstm.setString(4, usuarios.getCpf());
              pstm.setDate(5, new java.sql.Date (usuarios.getDataNascimento().getTime()));
             pstm.setString(6, usuarios.getSenha());
             pstm.setInt(7, usuarios.getNivel());
             pstm.setString(8, usuarios.getAtivo());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
          Usuarios usuarios = new Usuarios();
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

             String sql = "select * from usuarios where idUsuarios=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                usuarios.setIdUsuarios(rs.getInt("idUsuarios"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setApelido(rs.getString("apelido"));
                usuarios.setCpf(rs.getString("cpf"));
                usuarios.setDataNascimento(rs.getDate("data_nascimento"));
                usuarios.setSenha(rs.getString("senha"));
                usuarios.setNivel(rs.getInt("nivel"));
                usuarios.setAtivo(rs.getString("ativo"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return usuarios;
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

             String sql = "select * from usuarios";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Usuarios usuarios = new Usuarios();
                usuarios.setIdUsuarios(rs.getInt("idUsuarios"));
                usuarios.setNome(rs.getString("nome"));
                  usuarios.setApelido(rs.getString("apelido"));
                   usuarios.setCpf(rs.getString("cpf"));
                    usuarios.setDataNascimento(rs.getDate("dataNascimento"));
                usuarios.setSenha(rs.getString("senha"));
                usuarios.setNivel(rs.getInt("nivel"));
                usuarios.setAtivo(rs.getString("ativo"));
              
                lista.add(usuarios);
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
       Usuarios usuarios = (Usuarios) object;
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

             String sql = "update usuarios set nome=?,apelido=?,cpf=?," + "dataNascimento=?,senha=?,nivel=?,ativo=? where idUsuarios=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(8, usuarios.getIdUsuarios());
              pstm.setString(1, usuarios.getNome());
              pstm.setString(2, usuarios.getApelido());
              pstm.setString(3, usuarios.getCpf());
             pstm.setDate(4, new java.sql.Date (usuarios.getDataNascimento().getTime()));
             pstm.setString(5, usuarios.getSenha());
             pstm.setInt(6, usuarios.getNivel());
             pstm.setString(7, usuarios.getAtivo());
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
        Usuarios usuarios = (Usuarios) object;
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

             String sql = "delete from usuarios where idUsuarios=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, usuarios.getIdUsuarios());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.setIdUsuarios(3);
        usuarios.setNome("Paula");
        usuarios.setApelido("Pulas");
        usuarios.setCpf("0");
        //usuarios.setDataNascimento("");
        usuarios.setSenha("6545");
        usuarios.setNivel(1);
        usuarios.setAtivo("S");
        
        Usuarios_DAO usuarios_DAO = new Usuarios_DAO();
        usuarios_DAO.insert(usuarios);
        
        System.out.println("deu certo");
    }
    public void listLogin(){
    
    }
}
