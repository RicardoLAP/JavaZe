package Basico;

import javax.swing.JOptionPane;

/**
 *
 * 01) Fazer um programa que leia a idade de uma pessoa e informe se é maior de idade ou não
 */
public class MaiorIdade {
    
        public static void main(String [] args) {
            
              String inputIdade = JOptionPane.showInputDialog("Digite sua idade:  ");
              int idade = Integer.parseInt(inputIdade);
              
              if (idade >= 18) {
                  JOptionPane.showMessageDialog(null, "Você é maior de idade. ");
              } else {
                  JOptionPane.showMessageDialog(null, "Você é menor de idade");
              }
    }
       
}