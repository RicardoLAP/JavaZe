package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Desenvolva um programa que leia um número de 1 a 4 representando uma
operação matemática (adição, subtração, multiplicação ou divisão) e realize a
operação entre dois números fornecidos pelo usuário.
 */

public class OperadorMatematica {
    
    public static void main(String [] args) {
          String operacao = JOptionPane.showInputDialog("Escolha uma operação:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");

        int opcao = Integer.parseInt(operacao);

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Escolha um número de 1 a 4.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado da operação: " + resultado);
    }
        
    
    
}
