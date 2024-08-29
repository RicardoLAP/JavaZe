package Basico;

import javax.swing.JOptionPane;

/**
 *Desenvolva um programa que classifique um triângulo como equilátero, isósceles
ou escaleno, com base nos tamanhos de seus lados.
 */
public class TrianguloEquila {
    
    public static void main(String [] args) {
           String inputLado1 = JOptionPane.showInputDialog("Digite o tamanho do primeiro lado do triângulo:");
        double lado1 = Double.parseDouble(inputLado1);

        String inputLado2 = JOptionPane.showInputDialog("Digite o tamanho do segundo lado do triângulo:");
        double lado2 = Double.parseDouble(inputLado2);

        String inputLado3 = JOptionPane.showInputDialog("Digite o tamanho do terceiro lado do triângulo:");
        double lado3 = Double.parseDouble(inputLado3);

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            JOptionPane.showMessageDialog(null, "Os lados de um triângulo devem ser positivos.");
        } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "O triângulo é Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "O triângulo é Isósceles.");
            } else {
                JOptionPane.showMessageDialog(null, "O triângulo é Escaleno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os lados fornecidos não formam um triângulo.");
        }
    }
    
}
