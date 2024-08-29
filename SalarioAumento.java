package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Escreva um programa que leia o salário de um funcionário e calcule o valor do
aumento, considerando as seguintes condições: 10% de aumento para salários
até R$ 1500,00 e 5% de aumento para salários acima de R$ 1500,00.
 */

public class SalarioAumento {
    
    public static void main(String []  args) {
        
         String inputSalario = JOptionPane.showInputDialog("Digite o salário do funcionário:");
        double salario = Double.parseDouble(inputSalario);
        double aumento;
        double novoSalario;

        if (salario <= 1500.00) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.05;
        }

        novoSalario = salario + aumento;

        String mensagem = String.format("Salário atual: R$ %.2f\nAumento: R$ %.2f\nNovo salário: R$ %.2f", salario, aumento, novoSalario);
        JOptionPane.showMessageDialog(null, mensagem);
    
        
    }
    
}
