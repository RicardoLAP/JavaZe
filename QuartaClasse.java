package Basico;

import javax.swing.JOptionPane;

/*
4-Faça um programa leia quatro números e mostre a 
média ponderada, sabendo que o peso são 
respectivamente: 1,2,3,4.
Mostre no final os números informados e a média.
 
 */
public class QuartaClasse {
   
    public static void main(String [] args ){
        float MediaPond = 0.0f;
        float Num=0.0f,Num1=0.0f,Num2=0.0f,Num3=0.0f;
        
        Num = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro nº: "));
        Num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo nº: "));
        Num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o terceiro nº: "));
        Num3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o quarto nº: "));
        
        MediaPond = (Num*1+Num1*2+Num2*3+Num3*4)/10; //o valor 10 é da soma dos pesos
        JOptionPane.showMessageDialog(null,"A média Ponderada é: "+MediaPond);
    }
    
    
}