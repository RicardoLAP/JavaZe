package Basico;

import javax.swing.JOptionPane;

/**
 *Faça um programa que leia um número de 1 a 12 e mostre o mês correspondente
 */
public class Mes {
    
    public static void main(String [] args) {
        
             String input = JOptionPane.showInputDialog("Digite um número de 1 a 12:");
        int numero = Integer.parseInt(input);

        String mes = "";

        switch (numero) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido. Digite um número de 1 a 12.");
                return;
        }

        JOptionPane.showMessageDialog(null, "O número " + numero + " corresponde ao mês de " + mes);
    }
    }
    
