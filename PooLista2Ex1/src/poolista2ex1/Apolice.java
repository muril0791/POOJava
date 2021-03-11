package poolista2ex1;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }
    public double calcularValor(){        
        if(getSexo() == 'M' && getIdade() <= 25)
            return getValorAutomovel() * 10/100;
        else if(getSexo() == 'M' && getIdade() > 25)
            return getValorAutomovel() * 5/100;
        else
            return getValorAutomovel() * 2/100;
    }
    public String imprimir(){
        return "Número: " + getNumero() +"\n"
                + "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Valor Auto.: " + getValorAutomovel() + "\n"
                + "Valor Apólice: " + calcularValor();
    }

    
    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getIdade() {
        return idade;
    }

  
    public void setIdade(int idade) {
        this.idade = idade;
    }

 
    public char getSexo() {
        return sexo;
    }

 
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

  
    public double getValorAutomovel() {
        return valorAutomovel;
    }

   
    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
}
