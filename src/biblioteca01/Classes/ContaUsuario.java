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
public class ContaUsuario {
    
    private String nome;
    private String sexo;
    private Long cpf;
    private String endereço;
    private String dtNascimento;
    private Long telefone;
    private int tempo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    
    public void cadastrar(Long cpf, String nome, String sexo, String endereço, Long telefone, String dtNascimento){
        setCpf(cpf);
        setNome(nome);
        setSexo(sexo);
        setEndereço(endereço);
        setTelefone(telefone);
        setDtNascimento(dtNascimento);
        //setTempo(tempo);
    }
        
}
