package Basico;

import javax.swing.JOptionPane;

/**
 *
 *Crie um programa que determine se um número é par ou ímpar e, se for par, se é
divisível por 4.
 */
public class ParImparDivis4 {
        
        public static void main(String [] args) {
        String inputNumero = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(inputNumero);

        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par.");

            
            if (numero % 4 == 0) {
                JOptionPane.showMessageDialog(null, "O número é divisível por 4.");
            } else {
                JOptionPane.showMessageDialog(null, "O número não é divisível por 4.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    
    }
}
