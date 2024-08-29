package LacoDeRepeticao;

import javax.swing.JOptionPane;

/**
 *Faça um programa que mostre os números ímpares existentes de entre 1(inclusive) e
900(inclusive).
 */

public class Impares {
    
    public static void main(String[] args) {
        String numerosImpares = "Números ímpares entre 1 e 900:\n";

        int numero = 1;

        while (numero <= 900) {
            if (numero % 2 != 0) {
                numerosImpares += numero + " \n";
            }
            numero++;
        }

        JOptionPane.showMessageDialog(null, numerosImpares);
    }
}
