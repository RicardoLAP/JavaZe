package Basico;

/**
 *
3. Faça um algoritmo que leia as medidas dos três lados de um triângulo, calcule e escreva o seu perímetro e a sua área.
 *  07/05/2024
 */
import javax.swing.JOptionPane;

public class DquartaClasse {
    
        public static void main(String[] args) {
        
        String inputLado1 = JOptionPane.showInputDialog("Digite o valor do primeiro lado do triângulo:");
        double lado1 = Double.parseDouble(inputLado1);

        String inputLado2 = JOptionPane.showInputDialog("Digite o valor do segundo lado do triângulo:");
        double lado2 = Double.parseDouble(inputLado2);

        String inputLado3 = JOptionPane.showInputDialog("Digite o valor do terceiro lado do triângulo:");
        double lado3 = Double.parseDouble(inputLado3);

        
        double perimetro = lado1 + lado2 + lado3;

        
        double semiPerimetro = perimetro / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));

        
        String mensagem = "Perímetro do triângulo: " + perimetro + "\n" +
                          "Área do triângulo: " + area;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
