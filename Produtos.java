/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testamenorpreco;

/**
 *
 * @author Administrador
 */
public class Produtos {

    /**
     * @return the nome
     */
    
     private String nome;
    private double preco;
    
    
     public Produtos(String nome, double preco) {
        
        this.nome = nome;
        this.preco = preco;
        
        
    }

  

   
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
          
   
   
    
}
