/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import biblioteca01.Classes.ContaFuncionario;
import biblioteca01.Classes.ContaUsuario;
import biblioteca01.Classes.Livros;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class ContaBD {
    
    ConexãoBD conexao = new ConexãoBD();
    ContaUsuario contaUsuario = new ContaUsuario();
    ContaFuncionario contaFuncionario = new ContaFuncionario();
    Livros livros = new Livros();
    
    public void cadastrarContaBD(ContaUsuario contaUsuario) throws SQLException{
        
        conexao.conectarBD();
        
        try{
            String sql = "insert into usuário (cpf, nome, sexo, endereço, telefone, data_nas) values (?,?,?,?,?,?)";
            PreparedStatement pst = conexao.conectar.prepareStatement(sql);
            pst.setLong(1, contaUsuario.getCpf());
            pst.setString(2, contaUsuario.getNome());
            pst.setString(3, contaUsuario.getSexo());
            pst.setString(4, contaUsuario.getEndereço());
            pst.setLong(5, contaUsuario.getTelefone());
            pst.setString(6, contaUsuario.getDtNascimento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Conta Usuário cadastrada com sucesso!");
            
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar a conta Usuário no banco de dados!!"+ex);
        }
        
        conexao.desconectarBD();
    }
    
    public void cadastrarContaBD(ContaFuncionario contaFuncionario) throws SQLException{
        
        conexao.conectarBD();
        
        try{
            String sql = "insert into funcionário (cpf, nome, sexo, endereço, telefone, data_nas, imeil, senha) values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conexao.conectar.prepareStatement(sql);
            pst.setLong(1, contaFuncionario.getCpf());
            pst.setString(2, contaFuncionario.getNome());
            pst.setString(3, contaFuncionario.getSexo());
            pst.setString(4, contaFuncionario.getEndereço());
            pst.setLong(5, contaFuncionario.getTelefone());
            pst.setString(6, contaFuncionario.getDtNascimento());
            pst.setString(7, contaFuncionario.getEmail());
            pst.setString(8, contaFuncionario.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Conta Funcionário cadastrada com sucesso!");
            
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar a conta Funcionário no banco de dados!!"+ex);
        }
        
        conexao.desconectarBD();
    }
    
    public void cadastrarLivroBD(Livros livros) throws SQLException{
        
        conexao.conectarBD();
        
        try{
            String sql = "insert into livros (titulo, edição, autor, categoria, quantidade, valor, juros) values (?,?,?,?,?,?,?)";
            PreparedStatement pst = conexao.conectar.prepareStatement(sql);
            pst.setString(1, livros.getTitulo());
            pst.setString(2, livros.getEdição());
            pst.setString(3, livros.getAutor());
            pst.setString(4, livros.getCategoria());
            pst.setInt(5, livros.getQuant());
            pst.setDouble(6, livros.getValor());
            pst.setDouble(7, livros.getJuros());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
            
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o livro no banco de dados!!"+ex);
        }
        
        conexao.desconectarBD();
    }
}
