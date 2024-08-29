package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Escreva um programa em Java que verifique se um número é positivo, negativo ou
zero.
 */
public class PositivoNegativoZero {
    
    public static void main(String[] args) {
        // Solicita ao usuário que informe o número
        String inputNumero = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(inputNumero);

        // Verifica se o número é positivo, negativo ou zero
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero.");
        }
    }
    
}
