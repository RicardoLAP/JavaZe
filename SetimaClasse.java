package Basico;

/**
 7-Faça um programa para calcular o valor do volume de uma lata de óleo, utilizando a fórmula: 
volume = 3.14159 * R^2 * altura      07/05/2024
* 
 */
import javax.swing.JOptionPane;

public class SetimaClasse {
    
     public static void main(String[] args) {
        
        String inputRaio = JOptionPane.showInputDialog("Digite o raio da base da lata de óleo:");
        double Raio = Double.parseDouble(inputRaio);

        String inputAltura = JOptionPane.showInputDialog("Digite a altura da lata de óleo:");
        double Altura = Double.parseDouble(inputAltura);

        
        double Volume = 3.14159 * Math.pow(Raio, 2) * Altura;

        
        String mensagem = "O volume da lata de óleo é: " + Volume + " unidades cúbicas";
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    
}
