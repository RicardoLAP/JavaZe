package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 06) Fazer um programa que leia 2 valores e o tipo de media a ser calculada entre eles aritmética 
 * ou ponderada (1º 30% e 2º 70%)
 */

public class AritmetPondera {
    
    public static void main(String [] args) {
        
          // Solicita ao usuário que informe os dois valores
        String inputValor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        double valor1 = Double.parseDouble(inputValor1);

        String inputValor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        double valor2 = Double.parseDouble(inputValor2);

        // Solicita ao usuário que escolha o tipo de média (1 para aritmética, 2 para ponderada)
        String inputTipoMedia = JOptionPane.showInputDialog("Escolha o tipo de média:\n1 - Aritmética\n2 - Ponderada");
        int tipoMedia = Integer.parseInt(inputTipoMedia);

        double media;

        // Calcula a média de acordo com o tipo escolhido
        if (tipoMedia == 1) {
            media = (valor1 + valor2) / 2;
            JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
        } else if (tipoMedia == 2) {
            media = (valor1 * 0.3) + (valor2 * 0.7);
            JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida. Escolha 1 para média aritmética ou 2 para média ponderada.");
        }
    }
 }
    

