/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_poo;

/**
 *
 * @author user1
 */
public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    // get's e set's
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // construtores da classe
    public Midia(){
        
    }
    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    // métodos da classe
    public  String getTipo(){
        return "Midia";
    }
    public String getDetalhes(){
        return "\nCódigo: " + getCodigo()
            + "\nPreço: " + getPreco()
            + "\nNome: " + getNome();
    }
    
    public void printDados(){
        System.out.print("Dados da classe Mídia: " + getTipo() + getDetalhes());
    }
    public void inserirDados(){
        
    }
}
