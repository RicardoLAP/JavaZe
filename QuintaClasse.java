package Basico;

/**
 * 5-Faça um programa que possa entrar com o saldo de uma aplicação e mostre o novo saldo, mostrando
 * o saldo anterior e o atualizado. Sendo o Saldo anterior ter sido informado e inclusive informar também o reajuste.
 */

import javax.swing.JOptionPane;

public class QuintaClasse {
    public static void main(String[] args) {
        // Solicita ao usuário que insira o saldo anterior e o reajuste
        String inputSaldoAnterior = JOptionPane.showInputDialog("Digite o saldo anterior:");
        double saldoAnterior = Double.parseDouble(inputSaldoAnterior);

        String inputReajuste = JOptionPane.showInputDialog("Digite o valor do reajuste:");
        double reajuste = Double.parseDouble(inputReajuste);

        // Calcula o novo saldo
        double novoSaldo = saldoAnterior + reajuste;

        // Exibe o saldo anterior, o reajuste e o novo saldo
        String mensagem = "Saldo Anterior: R$" + saldoAnterior + "\n" +
                          "Reajuste: R$" + reajuste + "\n" +
                          "Novo Saldo: R$" + novoSaldo;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
