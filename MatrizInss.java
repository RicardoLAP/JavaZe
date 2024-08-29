package Matriz;

import javax.swing.JOptionPane;


/**
 *
 * 05 - Fazer uma matriz 10x10 com desconto de inss, no final mostrar. 
 */
public class MatrizInss {
    
   public static void main(String[] args) {
        // Definir a matriz 10x10
        float[][] matriz = new float[10][10];

        // Preencher a matriz com valores aleatórios
        preencherMatriz(matriz);

        // Calcular o desconto de INSS e mostrar a matriz resultante
        calcularDescontoINSS(matriz);
    }

    // Método para preencher a matriz com valores aleatórios
    public static void preencherMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Gerar um valor aleatório entre 1000 e 5000 para cada elemento
                matriz[i][j] = (float) (Math.random() * 4000 + 1000);
            }
        }
    }

    // Método para calcular o desconto de INSS e mostrar a matriz resultante
    public static void calcularDescontoINSS(float[][] matriz) {
        StringBuilder resultado = new StringBuilder("Matriz original:\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                float valorComDesconto = matriz[i][j] * 0.9f; // Desconto de 10%
                matriz[i][j] = valorComDesconto;
                resultado.append(String.format("%.2f\t", valorComDesconto));
            }
            resultado.append("\n");
        }

        resultado.append("\nMatriz com desconto de INSS:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado.append(String.format("%.2f\t", matriz[i][j]));
            }
            resultado.append("\n");
        }

        // Mostrar a matriz resultante usando JOptionPane
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
