package aula8;

public class PesadoPassgEletrico extends PesadoPassg implements VeiculoEletrico {
    protected int autonomia;
    public PesadoPassgEletrico(String matricula, String marca, String modelo, int potencia,int numQuadro, double peso, int numPassgMax){
        super(matricula, marca, modelo, potencia, numQuadro, peso, numPassgMax);

    }



    
    public int autonomia(){
        return 10;
    }
    public void carregar(int percentagem){
        this.autonomia=autonomia+autonomia*percentagem;

    }
}
