    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao; 

import bean.Cliente;
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
public class Cliente_DAO extends DAO_Abstract{
    
     @Override
    public void insert(Object object) {
        Cliente cliente = (Cliente) object;
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

             String sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setString(2, cliente.getNome());
              pstm.setString(3, cliente.getEmail());
              pstm.setString(4, cliente.getCpf());
              pstm.setString(5, cliente.getCep());
              pstm.setString(6, cliente.getTelefone());
              pstm.setString(7, cliente.getDados_pagamento()); 
              pstm.setString(8, cliente.getRg());
               pstm.setDate(9, new java.sql.Date (cliente.getData_nascimento().getTime()));
             pstm.setInt(10, cliente.getSexo());
             pstm.setString(11, cliente.getCidade());
             pstm.setString(12, cliente.getBairro());
             pstm.setString(13, cliente.getCelular());
             pstm.setString(14 , cliente.getPais());
             pstm.setString(15 , cliente.getApelido());
             
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
        Cliente cliente = new Cliente();
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

             String sql = "select * from cliente where idCliente=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCep(rs.getString("cep"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setDados_pagamento(rs.getString("Dados_pagamento"));
                cliente.setRg(rs.getString("rg"));
                cliente.setData_nascimento(rs.getDate("data_nascimento"));
                cliente.setSexo(rs.getInt("sexo"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setPais(rs.getString("pais"));
                cliente.setApelido(rs.getString("apelido"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return cliente;
 
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

             String sql = "select * from cliente";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCep(rs.getString("cep"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setDados_pagamento(rs.getString("Dados_pagamento"));
                cliente.setRg(rs.getString("rg"));
                cliente.setData_nascimento(rs.getDate("data_nascimento"));
                cliente.setSexo(rs.getInt("sexo"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setPais(rs.getString("pais"));
                cliente.setApelido(rs.getString("apelido"));
                lista.add(cliente);
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
         Cliente cliente = (Cliente) object;
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

             String sql = "update cliente set nome=?,email=?,cpf=?,cep=?,dados_pagamento=?,rg=?,"
                      + "data_nascimento=?,sexo=?,cidade=?,bairro=?,celular=?,pais=?,apelido=? where idCliente=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(14, cliente.getIdCliente());
              pstm.setString(1, cliente.getNome());
              pstm.setString(2, cliente.getEmail());
              pstm.setString(3, cliente.getCpf());
              pstm.setString(4, cliente.getCep());
              pstm.setString(5, cliente.getDados_pagamento());
              pstm.setString(6, cliente.getRg());
            pstm.setDate(7, new java.sql.Date (cliente.getData_nascimento().getTime()));
             pstm.setInt(8, cliente.getSexo());
             pstm.setString(9, cliente.getCidade());
             pstm.setString(10, cliente.getBairro());
             pstm.setString(11, cliente.getCelular());
             pstm.setString(12, cliente.getPais());
             pstm.setString(13, cliente.getApelido());
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
        Cliente cliente = (Cliente) object;
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

             String sql = "delete from cliente where idCliente=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getIdCliente());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(18);
        cliente.setNome("Tate");
        cliente.setEmail("tatetamye@gmail.com");
        cliente.setCpf("986.363.810-55");
        cliente.setCep("554444-99");
        cliente.setTelefone("555558888");
        cliente.setDados_pagamento("Cartao");
        cliente.setRg("5555538");
        //cliente.setDataNascimento("");
        cliente.setSexo(1);
        cliente.setCidade("Ponta Pora");
        cliente.setBairro("Residencial");
        cliente.setCelular("6545555");
        cliente.setPais("Brasil");
        cliente.setApelido("Vivi");
        
        Cliente_DAO cliente_DAO = new Cliente_DAO();
        cliente_DAO.insert(cliente);
        
        System.out.println("deu certo");
    }
    
}


