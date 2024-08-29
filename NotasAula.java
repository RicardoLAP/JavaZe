package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que verifique se um aluno foi aprovado, reprovado ou está em
recuperação, considerando que a média mínima para aprovação é 7.0 e a média
para recuperação é de 5.0.
 */

public class NotasAula {
    
    
     public static void main(String[] args) {
        String inputNota1 = JOptionPane.showInputDialog("Digite a nota da primeira avaliação:");
        double nota1 = Double.parseDouble(inputNota1);

        String inputNota2 = JOptionPane.showInputDialog("Digite a nota da segunda avaliação:");
        double nota2 = Double.parseDouble(inputNota2);

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "Aprovado! Média: " + media);
        } else if (media >= 5.0) {
            JOptionPane.showMessageDialog(null, "Em recuperação. Média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado. Média: " + media);
        }
    }
    
}
