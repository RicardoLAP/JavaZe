package Basico;

import javax.swing.JOptionPane;

/**
 * Desenvolva um programa que calcule o IMC (Índice de Massa Corporal) de uma
pessoa e indique em qual faixa de peso ela se encontra (abaixo do peso, peso
normal, sobrepeso, obesidade grau I, obesidade grau II ou obesidade grau III)
 */
public class Imc {
    
    public static void main(String [] args) {
        
            
        String inputPeso = JOptionPane.showInputDialog("Digite o seu peso em kg:");
        double peso = Double.parseDouble(inputPeso);

       
        String inputAltura = JOptionPane.showInputDialog("Digite a sua altura em metros:");
        double altura = Double.parseDouble(inputAltura);

        
        double imc = peso / (altura * altura);

       
        String faixaPeso;
        if (imc < 18.5) {
            faixaPeso = "Abaixo do peso";
        } else if (imc < 24.9) {
            faixaPeso = "Peso normal";
        } else if (imc < 29.9) {
            faixaPeso = "Sobrepeso";
        } else if (imc < 34.9) {
            faixaPeso = "Obesidade grau I";
        } else if (imc < 39.9) {
            faixaPeso = "Obesidade grau II";
        } else {
            faixaPeso = "Obesidade grau III";
        }

        // Mostrar o resultado
        String mensagem = String.format("Seu IMC é %.2f\nVocê está na faixa de: %s", imc, faixaPeso);
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
