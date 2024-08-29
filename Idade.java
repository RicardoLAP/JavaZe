package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Desenvolva um programa que leia a idade de uma pessoa e indique se ela é
criança (0-12 anos), adolescente (13-17 anos), adulto (18-59 anos) ou idoso (60
anos ou mais).
 */

public class Idade {
    
    public static void main(String[] args) {
        
         String input = JOptionPane.showInputDialog("Digite a idade da pessoa:");
        int idade = Integer.parseInt(input);

        if (idade >= 0 && idade <= 12) {
            JOptionPane.showMessageDialog(null, "Criança");
        } else if (idade >= 13 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto");
        } else if (idade >= 60) {
            JOptionPane.showMessageDialog(null, "Idoso");
        } else {
            JOptionPane.showMessageDialog(null, "Idade inválida");
        }
    }
    
}
