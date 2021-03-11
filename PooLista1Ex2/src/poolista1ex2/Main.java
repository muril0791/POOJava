/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3ex2sobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        Aluno aluno = null;
        int ra,anoIngresso;
        String nome,curso;
        double ac1,ac2,ag,af;
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Aluno\n2 - Mostrar média\n3 - Sair"));
            switch(opc){
                case 1 :
                    ra = Integer.parseInt(JOptionPane.showInputDialog("RA"));
                    nome = JOptionPane.showInputDialog("Nome");
                    curso = JOptionPane.showInputDialog("Curso");
                    anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Ano Ingresso"));
                    aluno = new Aluno(ra, nome, curso);
                    aluno.setAnoIngresso(anoIngresso);
                    break;
                case 2 : 
                    if(aluno != null){
                        if(aluno.getAnoIngresso() <= 2019){
                            ac1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
                            ac2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
                            JOptionPane.showMessageDialog(null,"A média é: " + aluno.calcularMedia(ac1, ac2));
                        }
                        else{
                            ac1 = Double.parseDouble(JOptionPane.showInputDialog("AC 1"));
                            ac2 = Double.parseDouble(JOptionPane.showInputDialog("AC 2"));
                            ag = Double.parseDouble(JOptionPane.showInputDialog("AG"));
                            af = Double.parseDouble(JOptionPane.showInputDialog("AF"));
                            JOptionPane.showMessageDialog(null,"A média é: " + aluno.calcularMedia(ac1, ac2, ag, af));
                        }
                    }
                    break;
                case 3 : break;
                default: break;
            }
        }
    }
    
}

