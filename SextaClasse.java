
package Basico;

/**
6-Faça um programa com a base e a altura de um retângulo e mostre a seguinte saída:
a - Perimetro
b - Area
c - Diagonal           07/05/2024
 */
import javax.swing.JOptionPane;


public class SextaClasse {
     public static void main(String[] args) {
        
        String inputBase = JOptionPane.showInputDialog("Digite a base do retângulo:");
        double Base = Double.parseDouble(inputBase);

        String inputAltura = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        double Altura = Double.parseDouble(inputAltura);

        
        double Perimetro = 2 * (Base + Altura);
        double Area = Base * Altura;
        double Diagonal = Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));

        
        String Mensagem = "Perímetro: " + Perimetro + "\n" +
                          "Área: " + Area + "\n" +
                          "Diagonal: " + Diagonal;
        JOptionPane.showMessageDialog(null, Mensagem);
    }
    
    
    
}
