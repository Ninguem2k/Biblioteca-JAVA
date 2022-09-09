/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca01.Classes;

/**
 *
 * @author HACKER
 */
public class ContaFuncionario extends ContaUsuario{
    
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void cadastrar(Long cpf, String nome, String sexo, String endereço, Long telefone, String dtNascimento, String email, String senha) {
        setCpf(cpf);
        setNome(nome);
        setSexo(sexo);
        setEndereço(endereço);
        setTelefone(telefone);
        setDtNascimento(dtNascimento);
        setEmail(email);
        setSenha(senha);
    }
    
}
