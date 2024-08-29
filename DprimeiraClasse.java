package Basico;

/**
 
 */

import javax.swing.JOptionPane;


public class DprimeiraClasse {
    
        public static void main(String[] args) {
        
        String inputMassa = JOptionPane.showInputDialog("Digite a massa da pessoa (em quilogramas):");
        double Massa = Double.parseDouble(inputMassa);

        String inputAltura = JOptionPane.showInputDialog("Digite a altura da pessoa (em metros):");
        double Altura = Double.parseDouble(inputAltura);

        
        double Imc = Massa / (Altura * Altura);

        
        String Mensagem = "O Índice de Massa Corporal (IMC) da pessoa é: " + Imc;
        JOptionPane.showMessageDialog(null, Mensagem);
    }
    
}
