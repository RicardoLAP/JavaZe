package Basico;

import javax.swing.JOptionPane;

/**
 *
 * Escreva um programa em Java que leia um número de 1 a 7 e exiba o dia da
semana correspondente.
 */
public class DiasdaSemana {
    
    public static void main(String [] args) {
          
        String inputNumero = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
        int numero = Integer.parseInt(inputNumero);

        
        String diaDaSemana;
        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Número inválido. Digite um número de 1 a 7.";
                break;
        }

        
        JOptionPane.showMessageDialog(null, diaDaSemana);
    }
    
}
