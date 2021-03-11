/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3ex2sobrecarga;

/**
 *
 * @author Moreno
 */
public class Aluno {

    private int ra;
    private String nome;
    private String curso;
    private int anoIngresso;

    public Aluno() {
    }

    public Aluno(int ra, String nome, String curso) {
        this(ra, nome);
        this.curso = curso;
    }

    public Aluno(int ra) {
        this.ra = ra;
    }

    public Aluno(int ra, String nome) {
        this(ra);
        this.nome = nome;
    }

    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public double calcularMedia(double ac1, double ac2, double ag, double af) {
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the anoIngresso
     */
    public int getAnoIngresso() {
        return anoIngresso;
    }

    /**
     * @param anoIngresso the anoIngresso to set
     */
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

}
