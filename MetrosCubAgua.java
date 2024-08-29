package Basico;

import javax.swing.JOptionPane;

/**
 *07) Fazer um programa que leia o consumo médio em metros cúbicos de água de um cliente e o tipo de cliente 
 * (comercial R$ 2,84 o metro cúbico ou residencial R$ 2,68 o metro cúbico) O programadeverá retornar o valor da conta.
 * 
 */
public class MetrosCubAgua {
    
    public static void main(String[] args) {
        
        // Solicita ao usuário que informe o consumo médio em metros cúbicos
        String inputConsumo = JOptionPane.showInputDialog("Digite o consumo médio em metros cúbicos:");
        double consumo = Double.parseDouble(inputConsumo);

        // Solicita ao usuário que escolha o tipo de cliente (1 para comercial, 2 para residencial)
        String inputTipoCliente = JOptionPane.showInputDialog("Escolha o tipo de cliente:\n1 - Comercial\n2 - Residencial");
        int tipoCliente = Integer.parseInt(inputTipoCliente);

        double valorMetroCubico;
        double valorConta;

        // Define o valor do metro cúbico com base no tipo de cliente
        if (tipoCliente == 1) {
            valorMetroCubico = 2.84; // Valor para cliente comercial
        } else if (tipoCliente == 2) {
            valorMetroCubico = 2.68; // Valor para cliente residencial
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida. Escolha 1 para cliente comercial ou 2 para cliente residencial.");
            return; // Encerra o programa se a opção for inválida
        }

        // Calcula o valor da conta de água
        valorConta = consumo * valorMetroCubico;

        // Exibe o valor da conta utilizando o JOptionPane
        JOptionPane.showMessageDialog(null, "O valor da conta de água é: R$ " + valorConta);
    }
    
}
