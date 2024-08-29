package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 03) Fazer um programa que leia o valor da base e altura de um retângulo e retorne se esse retângulo é também quadrado
 */
public class RetangQuadra {
    
     public static void main(String[] args) {
        // Solicita ao usuário que informe a base e altura do retângulo
        String inputBase = JOptionPane.showInputDialog("Digite o valor da base do retângulo:");
        double base = Double.parseDouble(inputBase);

        String inputAltura = JOptionPane.showInputDialog("Digite o valor da altura do retângulo:");
        double altura = Double.parseDouble(inputAltura);

        // Verifica se a base e altura são iguais (retângulo é quadrado)
        if (base == altura) {
            JOptionPane.showMessageDialog(null, "O retângulo é também um quadrado.");
        } else {
            JOptionPane.showMessageDialog(null, "O retângulo não é um quadrado.");
        }
    }
    
    
}
