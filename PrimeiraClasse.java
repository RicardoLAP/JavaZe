package Basico;

import javax.swing.JOptionPane;

//Exercício 01 Antecessor e Sucessor 06/05/2024

public class PrimeiraClasse {
    
    public static void main(String args []) {
         
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        int Antecessor = Numero - 1;
        int Sucessor = Numero + 1;

        JOptionPane.showMessageDialog(null, "O antecessor de " + Numero + " é " + Antecessor + "\nO sucessor de " + Numero + " é " + Sucessor);
            
    }
}
