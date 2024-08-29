
package Basico;

//3-Faça um programa que leia um número e mostre a terça parte do mesmo. Mostrando no final qual o número e sua terça parte.

import javax.swing.JOptionPane;


public class TerceiraClasse {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(input);

        double tercaParte = numero / 3;

        JOptionPane.showMessageDialog(null, "O número informado é: " + numero + "\nA terça parte deste número é: " + tercaParte);
    }
}
