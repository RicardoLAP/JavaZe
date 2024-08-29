package LacoDeRepeticao;

import javax.swing.JOptionPane;

/**
 *Faça um programa que leia 200 números e retorne a soma dos valores divisíveis por 3
e 7 ao mesmo tempo.
 */
public class DivisaoTeS {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 1;

        while (contador <= 200) {
            String input = JOptionPane.showInputDialog("Digite o valor " + contador + " de 200:");
            int valor = Integer.parseInt(input);

            if (valor % 3 == 0 && valor % 7 == 0) {
                soma += valor;
            }

            contador++;
        }

        JOptionPane.showMessageDialog(null, "A soma dos valores divisíveis por 3 e 7 ao mesmo tempo é: " + soma);
    }
    
}
