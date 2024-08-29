package Basico;

import javax.swing.JOptionPane;

/**
 *09) Fazer um programa que leia dois valores e retorne qual é o maior
 */
public class ValoresMaior {
    
        public static void main(String [] args) {
            
             String inputValor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        double valor1 = Double.parseDouble(inputValor1);

        String inputValor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        double valor2 = Double.parseDouble(inputValor2);

        double maior;

        // Verifica qual dos valores é o maior
        if (valor1 > valor2) {
            maior = valor1;
        } else {
            maior = valor2;
        }

        // Exibe o maior valor utilizando o JOptionPane
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
        }
    
}
