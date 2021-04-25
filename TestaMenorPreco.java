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
public class TestaMenorPreco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Produtos produto[] = {
         new Produtos("Sapato",100),
        new Produtos("camisa",46),
        new Produtos("oculos",16),
         new Produtos("Luvas",46),
        new Produtos("Meias",17)};
         int maisBarato = 0;
        for (int atual = 0; atual  < produto.length; atual++) {
      int menor = buscamenor(produto,atual,produto.length -1);
      Produtos produtoAtual = produto[atual];
      Produtos produtoMenor = produto[menor];
      produto[atual] = produtoMenor;
      produto[menor] = produtoAtual;
 
            
        }
         for(Produtos item : produto){
             
             System.out.println(item.getNome() +" O valor é: " +item.getPreco());
         }
        
    }
    private static int buscamenor(Produtos[] produtos,int inicio,int termino){
       int maisBarato = inicio;
       for(int atual = inicio;atual <= termino;atual++){
           
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
           
                maisBarato = atual;
       }
        
        
       }
       return maisBarato; 
    }
    
}
