package Basico;

import javax.swing.JOptionPane;

/**
 *Faça um programa que leia o código de um produto e sua quantidade em estoque.
Se o estoque for menor que 10 unidades, mostre uma mensagem "Estoque baixo",
se for entre 10 e 20 unidades, "Estoque médio", e se for maior que 20 unidades,
"Estoque alto".
 */
public class Estoque {
    
    public static void main(String [] args) {
        
          
        String codigoProduto = JOptionPane.showInputDialog("Digite o código do produto:");
        
      
        String inputQuantidade = JOptionPane.showInputDialog("Digite a quantidade em estoque:");
        int quantidade = Integer.parseInt(inputQuantidade);

       
        if (quantidade < 10) {
            JOptionPane.showMessageDialog(null, "Estoque baixo");
        } else if (quantidade <= 20) {
            JOptionPane.showMessageDialog(null, "Estoque médio");
        } else {
            JOptionPane.showMessageDialog(null, "Estoque alto");
        }
    }
    
}
