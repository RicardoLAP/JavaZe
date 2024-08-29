package Basico;

/**
 * 8 - Faça um programa que leia e mostre nome, idade, sexo.  07/05/2024
 * 
 */
import javax.swing.JOptionPane;

public class OitavaClasse {
    public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String InputIdade = JOptionPane.showInputDialog("Digite a sua idade:");
        int Idade = Integer.parseInt(InputIdade);
        String Sexo = JOptionPane.showInputDialog("Digite o seu sexo (M para masculino, F para feminino):");

        
        String mensagem = "Nome: " + Nome + "\nIdade: " + Idade + " anos\nSexo: " + Sexo;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
