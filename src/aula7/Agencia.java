package aula7;

public class Agencia {
    protected String nome;
    protected String endereco;
    protected Apartamento[] apartamento = new Apartamento[10000]; 
    protected Quarto[] quarto = new Quarto[10000];
    public Agencia (String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }
}
