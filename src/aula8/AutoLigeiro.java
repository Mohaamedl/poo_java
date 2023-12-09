package aula8;

public class AutoLigeiro extends VeiculosMotorizados implements KmPercorridosInterface {
    protected double capacidadeBag; 
    protected int numQuadro;
    public AutoLigeiro(String matricula, String marca, String modelo, int potencia, int numQuadro, double capacidadeBag){
        super(matricula,marca,modelo,potencia);
        try{
            if(numQuadro>0&&capacidadeBag>0){
                this.capacidadeBag=capacidadeBag;
                this.numQuadro=numQuadro;
            }
        }
        catch(Exception e) {
            System.out.println("Dados invalidos.");
        }
    }
    public double getCapacidadeBag() {
        return capacidadeBag;
    }
    public int getNumQuadro() {
        return numQuadro;
    }
    public void setCapacidadeBag(double capacidadeBag) {
        this.capacidadeBag = capacidadeBag;
    }
    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }
    public String toString() {
        return "Automovel ligeiro\n"+super.toString()+String.format("Capacidade bagageira: %.1f\nNumero do quadro: %s\n\n",capacidadeBag,numQuadro);
    }
    
    public boolean equals(AutoLigeiro obj) {
        AutoLigeiro outro = (AutoLigeiro) obj;
        if( outro.capacidadeBag!=obj.capacidadeBag || outro.numQuadro!=obj.numQuadro) return false;
        return super.equals(obj);
    }
    public int hashCode(){
        int hash = super.hashCode();
        hash = 53*hash + (int) capacidadeBag;
        hash = 53*hash + (int) numQuadro;
        return hash;
    }
    public void trajeto(int quilometros){

    }
    public int ultimoTrajeto(){
        return 12;
    }
    public int distanciaTotal(){
        return 30;
    }

    
}
