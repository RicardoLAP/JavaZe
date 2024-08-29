package Basico;

import javax.swing.JOptionPane;

/**
 *Crie um programa que determine se uma pessoa pode ou não votar, considerando
a idade mínima de 16 anos para votar no Brasil.
 */
public class Votar {
    
    public static void main(String [] args) {
        
        String inputIdade = JOptionPane.showInputDialog("Digite a idade da pessoa:");
        int idade = Integer.parseInt(inputIdade);

        if (idade >= 16) {
            JOptionPane.showMessageDialog(null, "Você pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode votar.");
        }
        
    }
    
}
