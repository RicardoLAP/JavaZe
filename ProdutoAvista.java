package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 08) Fazer um programa que leia o valor de um produto e a condição de pagamento: se for a vista 10% 
 * de desconto ou a prazo com 15% de juros. O programadeverá retornar o valor final do produto
 */
public class ProdutoAvista {
    
        public static void main(String [] args) {
            
             String inputValorProduto = JOptionPane.showInputDialog("Digite o valor do produto:");
        double valorProduto = Double.parseDouble(inputValorProduto);

       
        String inputCondicaoPagamento = JOptionPane.showInputDialog("Escolha a condição de pagamento:\n1 - À vista (com desconto de 10%)\n2 - A prazo (com acréscimo de 15% de juros)");
        int condicaoPagamento = Integer.parseInt(inputCondicaoPagamento);

        double valorFinal;

     
        if (condicaoPagamento == 1) {
            valorFinal = valorProduto - (valorProduto * 0.1); 
        } else if (condicaoPagamento == 2) {
            valorFinal = valorProduto + (valorProduto * 0.15); 
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida. Escolha 1 para pagamento à vista ou 2 para pagamento a prazo.");
            return; 
        }

        
        JOptionPane.showMessageDialog(null, "O valor final do produto é: R$ " + valorFinal);
        }
    
}
