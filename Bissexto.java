package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Crie um programa que determine se um ano é bissexto ou não.
 */
public class Bissexto {
    
          public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o ano:");
        int ano = Integer.parseInt(input);

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            JOptionPane.showMessageDialog(null, ano + " é um ano bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, ano + " não é um ano bissexto.");
        }
    }
    
}
