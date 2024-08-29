package Matriz;

import javax.swing.JOptionPane;

/**
 *01 - Faça uma algoritmo com uma matriz 4X4 de números reais.
     Mostrar os números no final.
 */
public class MatrizQuartoxQuatro {
    
    public static void main(String [] args) {
        
         double[][] matriz = new double[4][4];

        
        for (int Lin = 0; Lin< 4; Lin++) {
            for (int Col = 0; Col < 4; Col++) {
                String input = JOptionPane.showInputDialog("Digite um número real para a posição [" + Lin + "][" +Col + "]");
                matriz[Lin][Col] = Double.parseDouble(input);
            }
        }
        
        StringBuilder mensagem = new StringBuilder("Matriz 4x4 de Números Reais:\n");
        for (int Lin = 0; Lin< 4; Lin++) {
            for (int Col= 0; Col< 4; Col++) {
                mensagem.append(matriz[Lin][Col]).append("\t");
            }
            mensagem.append("\n");
        }
        

       
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
        
}
    

