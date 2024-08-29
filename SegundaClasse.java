package Basico;

// 2-Faça um programa que mostre nome, endereço e telefone. 06/05/2024

import javax.swing.JOptionPane;

public class SegundaClasse {
    
    public static void main(String args[]) {
         
        String Nome = JOptionPane.showInputDialog("Informe o seu nome:");
        String Endereco = JOptionPane.showInputDialog("Informe o seu endereço:");
        String Telefone = JOptionPane.showInputDialog("Informe o seu telefone:");

        JOptionPane.showMessageDialog(null, "Nome: " + Nome + "\nEndereço: " + Endereco + "\nTelefone: " + Telefone);
            
    }
}
