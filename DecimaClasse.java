package Basico;

/**
 * 10.Faça um algoritmo para ler a base e a altura de um triângulo. Em seguida, escreva a área do mesmo.
07/05/2024
 */
import javax.swing.JOptionPane;

public class DecimaClasse {
    
    public static void main(String[] args) {
        
            String inputBase = JOptionPane.showInputDialog("Digite a base do triângulo:");
            double Base = Double.parseDouble(inputBase);

            String inputAltura = JOptionPane.showInputDialog("Digite a altura do triângulo:");
            double Altura = Double.parseDouble(inputAltura);

            
            double Area = (Base * Altura) / 2;

            
            String mensagem = "A área do triângulo é: " + Area;
            JOptionPane.showMessageDialog(null, mensagem);
        }
}
    

