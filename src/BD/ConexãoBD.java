/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class ConexãoBD {
    
    public Connection conectar;
    public ResultSet rs;
    public Statement stm;
    
    public void conectarBD() throws SQLException{
        try{
            String caminho = "jdbc:postgresql://localhost:5432/Biblioteca";
            String usuario = "postgres";
            String senha = "root";
            conectar = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o banco de dados!"+ex.getMessage());
        }
    }
    
    public void desconectarBD(){
        try{
            conectar.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar fechar o banco de dados!"+ex.getMessage());
        }
    }
    
    public void executarSql(String sql) throws Exception{
        
        try{
            stm = (Statement) conectar.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //rs = stm.executeQuery(sql);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao executar o sql!"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "SQL que deu erro: "+sql);
        }
    }
}
