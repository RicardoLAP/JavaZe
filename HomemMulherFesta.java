package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 10) Fazer um programa que leia a quantidade de homens e mulheres 
 * que compareceram em uma festa e retorne qual teve maior quantidade e o percentual correspondente de cada um
 */

public class HomemMulherFesta {
        
        public static void main(String[] args) {
            
              
        String inputHomens = JOptionPane.showInputDialog("Digite a quantidade de homens:");
        int quantidadeHomens = Integer.parseInt(inputHomens);

        String inputMulheres = JOptionPane.showInputDialog("Digite a quantidade de mulheres:");
        int quantidadeMulheres = Integer.parseInt(inputMulheres);

       
        String generoMaiorQuantidade;
        int maiorQuantidade;
        if (quantidadeHomens > quantidadeMulheres) {
            generoMaiorQuantidade = "Homens";
            maiorQuantidade = quantidadeHomens;
        } else if (quantidadeMulheres > quantidadeHomens) {
            generoMaiorQuantidade = "Mulheres";
            maiorQuantidade = quantidadeMulheres;
        } else {
            JOptionPane.showMessageDialog(null, "Quantidades iguais de homens e mulheres.");
            return; 
        }

        
        float percentualHomens = (float) quantidadeHomens / (quantidadeHomens + quantidadeMulheres) * 100;
        float percentualMulheres = (float) quantidadeMulheres / (quantidadeHomens + quantidadeMulheres) * 100;

        
        JOptionPane.showMessageDialog(null, "O gênero com maior quantidade foi: " + generoMaiorQuantidade +
                "\nQuantidade: " + maiorQuantidade +
                "\nPercentual de Homens: " + percentualHomens + "%" +
                "\nPercentual de Mulheres: " + percentualMulheres + "%");
        }
    
}
