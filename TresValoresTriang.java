package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 05) Fazer um programa que leia 3 valores e verifique se é possível formar triangulo
 * (para formar triangulo nenhum valor pode ser maior que a soma dos demais)
 */

public class TresValoresTriang {
    
    public static void main(String[] args) {
        
        // Solicita ao usuário que informe os três valores
        String inputA = JOptionPane.showInputDialog("Digite o primeiro valor:");
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog("Digite o segundo valor:");
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog("Digite o terceiro valor:");
        double c = Double.parseDouble(inputC);

        // Verifica se é possível formar um triângulo
        if (a < b + c && b < a + c && c < a + b) {
            JOptionPane.showMessageDialog(null, "É possível formar um triângulo com os valores informados.");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo com os valores informados.");
        }
    }
    
}
