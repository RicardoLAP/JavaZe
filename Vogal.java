package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Escreva um programa que determine se uma letra lida é uma vogal ou uma
consoante.
 */
public class Vogal {
    
    public static void main(String [] args) {
        
          
        String inputLetra = JOptionPane.showInputDialog("Digite uma letra:");
        
      
        if (inputLetra.length() != 1) {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas uma letra.");
            return;
        }
        
       
        char letra = inputLetra.charAt(0);

        
        if (!Character.isLetter(letra)) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um caractere alfabético.");
            return;
        }
        
        
        letra = Character.toLowerCase(letra);

        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            JOptionPane.showMessageDialog(null, "A letra " + letra + " é uma vogal.");
        } else {
            JOptionPane.showMessageDialog(null, "A letra " + letra + " é uma consoante.");
        }
    }
    
}
