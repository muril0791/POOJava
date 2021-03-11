/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1LIsta;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        int opc = 0;
        double n1=0,n2=0;
        Calculadora calc = new Calculadora();
        while(opc != 5){
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair"));
           
            if(opc != 5){
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Num. 1"));            
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Num. 2"));
            }
            
            switch(opc){
                case 1: 
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.soma(n1, n2));
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.subtracao(n1, n2));
                    break;
                case 3:
                     JOptionPane.showMessageDialog(null, "Resultado: " + calc.multiplicacao(n1, n2));
                    break;
                case 4: 
                     JOptionPane.showMessageDialog(null, "Resultado: " + calc.divisao(n1, n2));
                     break;
                case 5: break;
                default:break;
            }
        }
    }
    
}
