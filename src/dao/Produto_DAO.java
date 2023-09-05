package dao;


import bean.Produto;
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
public class Produto_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Produto produto = (Produto) object;
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

             String sql = "insert into produto values(?,?,?,?,?)";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, produto.getIdProduto());
               pstm.setDouble(2, produto.getValor_unitario());
              pstm.setString(3, produto.getCategoria());
              pstm.setString(4, produto.getDescricao());
             pstm.setString(5, produto.getColecao());
          
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Produto_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Produto_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    public Object List(int id) {
        Produto produto = new Produto();
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

             String sql = "select * from produto where idProduto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs= pstm.executeQuery();
            if(rs.next()== true){
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setValor_unitario(rs.getDouble("valor_unitario"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setColecao(rs.getString("colecao"));
            }
             
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }
    return produto;
    
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

             String sql = "select * from produto";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
          
            while(rs.next()== true){
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setValor_unitario(rs.getDouble("valor_unitario"));
                  produto.setCategoria(rs.getString("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setColecao(rs.getString("colecao"));
             
              
                lista.add(produto);
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
            Produto produto = (Produto) object;
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

             String sql = "update produto set valor_unitario=?,categoria=?,descricao=?,colecao=? where idProduto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(5, produto.getIdProduto());
              pstm.setDouble(1, produto.getValor_unitario());
              pstm.setString(2, produto.getCategoria());
              pstm.setString(3, produto.getDescricao());
             pstm.setString(4, produto.getColecao());
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
        Produto produto = (Produto) object;
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

             String sql = "delete from produto where idProduto=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, produto.getIdProduto());
             pstm.executeUpdate();
            //stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);

        }


    }
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setIdProduto(5);
         produto.setValor_unitario(19.0);
        produto.setCategoria("Camisa");
        produto.setDescricao("M");
        produto.setColecao("DC");
       
        
        Produto_DAO produto_DAO = new Produto_DAO();
        produto_DAO.insert(produto);
        
        System.out.println("deu certo");
    }
    
}
