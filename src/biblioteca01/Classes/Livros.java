/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca01.Classes;

/**
 *
 * @author ferna
 */
public class Livros {
    
    private String titulo;
    private String edição;
    private String autor;
    private String categoria;
    private int quant;
    private double valor;
    private double juros;
        
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdição() {
        return edição;
    }

    public void setEdição(String edição) {
        this.edição = edição;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    
    public void cadastrar(String titulo, String edição, String autor, String categoria, Integer quant, double valor, double juros){
        setTitulo(titulo);
        setEdição(edição);
        setAutor(autor);
        setCategoria(categoria);
        setQuant(quant);
        setJuros(juros);
        setValor(valor);
    }
    
}
