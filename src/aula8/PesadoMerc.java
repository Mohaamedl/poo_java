package aula8;

public class PesadoMerc extends VeiculosMotorizados implements KmPercorridosInterface {
    protected int numQuadro;
    protected double cargaMax, peso;
    public PesadoMerc(String matricula, String marca, String modelo, int potencia, int numQuadro, double cargaMax, double peso){
        super(matricula,marca,modelo,potencia);
        try{
            if(numQuadro>0 && peso>0 && cargaMax>0) {
                this.cargaMax=cargaMax;
                this.peso=peso;
                this.numQuadro=numQuadro;
            }
        }
        catch(Exception e) {
            System.out.println("Dados invalidos.");
        }
    }
    public int getNumQuadro() {
        return numQuadro;
    }
    public double getPeso() {
        return peso;
    }
    public double getCargaMax() {
        return cargaMax;
    }
    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }
    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

   public String toString() {
        return "Pesado de Mercadorias\n"+super.toString()+String.format("Numero do quadro: %d\nCarga Maxima: %.1f\nPeso: %.1f\n",numQuadro,cargaMax,peso);
    }

    public boolean equals(PesadoMerc obj) {
        PesadoMerc outro = (PesadoMerc) obj;
        if(outro.numQuadro!=obj.numQuadro || outro.peso!=obj.peso || outro.cargaMax!=obj.cargaMax) return false;
        return super.equals(obj);
        
        
    }
    public int hashCode(){
        int hash=super.hashCode();
        hash = 53*hash+ (int) peso;
        hash = 53*hash + (int) numQuadro;
        hash = 53*hash +(int) cargaMax;
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
