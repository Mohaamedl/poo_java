package aula8;

public class AutoLigEletrico extends AutoLigeiro implements VeiculoEletrico {
    protected int autonomia;
    public AutoLigEletrico(String matricula, String marca, String modelo, int potencia, int numQuadro, double capacidadeBag,int autonomia){
        super(matricula, marca, modelo, potencia, numQuadro, capacidadeBag);
        this.autonomia=autonomia;
    }
    public int autonomia(){
        return 10;
    }
    public void carregar(int percentagem){
        this.autonomia=autonomia+autonomia*percentagem;

    }

}
