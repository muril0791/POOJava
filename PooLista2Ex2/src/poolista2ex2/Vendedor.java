package poolista2ex2;

import java.util.ArrayList;

public class Vendedor {

    private int codigo;
    private String nome;
    private double percent;
    Vendedor vendedor = null;
    ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();

    public Vendedor() {

    }

    public Vendedor(int codigo, String nome, double percent) {
        this.codigo = codigo;
        this.nome = nome;
        this.percent = percent;
    }

    public double calcularPagamentoComissao(double valorvenda) {
        return valorvenda * (percent / 100);
    }

    public double calcularPagamentoComis(double valorvenda, double desconto) {
        return valorvenda * (percent / 100) - desconto;
    }

    public String imprimir(double valorvenda, double desconto) {

        return "Número: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + percent + "\n"
                + "Sexo: " + valorvenda + "\n"
                + "Valor Auto.: " + desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Vendedor> getListaVendedor() {
        return listaVendedor;
    }

    public void setListaVendedor(ArrayList<Vendedor> listaVendedor) {
        this.listaVendedor = listaVendedor;
    }

}
