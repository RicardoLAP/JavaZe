package Basico;

/**
 *
 * Fazer um exercício Imposto de Renda 08/05/2024
 */
import javax.swing.JOptionPane;

public class ImpostoRenda {
        
        public static void  main(String[] args) {
            
            String inputSalario = JOptionPane.showInputDialog("Digite o seu salário bruto:");
            double salario = Double.parseDouble(inputSalario);

            if (salario < 2259.20) {
            JOptionPane.showMessageDialog(null, "Não há dedução fiscal.");

            } else if (salario >= 2259.20 && salario < 2826.65) {
            double deducao = salario * 0.075 - 158.40;
            JOptionPane.showMessageDialog(null, "A dedução fiscal é de 7.5%\nVocê deve deduzir o valor de R$ " + deducao);

            } else if (salario >= 2826.66 && salario < 3751.05) {
            double deducao = salario * 0.15 - 370.40;
            JOptionPane.showMessageDialog(null, "A dedução fiscal é de 15%\nVocê deve deduzir o valor de R$ " + deducao);

            } else if (salario >= 3751.06 && salario < 4664.68) {
            double deducao = salario * 0.225 - 651.73;
            JOptionPane.showMessageDialog(null, "A dedução fiscal é de 22.5%\nVocê deve deduzir o valor de R$ " + deducao);

            } else {
            double deducao = salario * 0.275 - 884.96;
            JOptionPane.showMessageDialog(null, "A dedução fiscal é de 27.5%\nVocê deve deduzir o valor de R$ " + deducao);
             }
            }
    
}
