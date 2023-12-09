package aula8;


public class PesadoPassg extends VeiculosMotorizados implements KmPercorridosInterface {
    protected double peso;
    protected int numPassgMax,numQuadro;
    public PesadoPassg(String matricula, String marca, String modelo, int potencia,int numQuadro, double peso, int numPassgMax){
        super(matricula,marca,modelo,potencia);
        try{
            if(numQuadro>0&&peso>0&&numPassgMax>0){
                this.numQuadro=numQuadro;
                this.peso=peso;
                this.numPassgMax=numPassgMax;
            }
        }
        catch(Exception e) {
            System.out.println("Dados Invalidos.");
        }

    }
    public double getPeso() {
        return peso;
    }
    public int getNumQuadro() {
        return numQuadro;
    }
    public int getNumPassgMax() {
        return numPassgMax;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }
    public void setNumPassgMax(int numPassgMax) {
        this.numPassgMax = numPassgMax;
    }
    public String toString(){
        return "Pesado de passageiros"+ super.toString()+String.format("Peso: %.1f\nNumero de quadro: %d\nNumero maximo de passageiros: %d\n",
        peso,numQuadro,numPassgMax);
    }

    public boolean equals(PesadoPassg obj) {
        PesadoPassg outro = (PesadoPassg) obj;
        if(outro.peso!=obj.peso || outro.numQuadro!=obj.numQuadro || outro.numPassgMax!=obj.numPassgMax) return false;
        return super.equals(obj);
    
        
    }
    public int  hashCode(){
        int hash = super.hashCode();
        hash = 53*hash+ (int) peso;
        hash = 53*hash+(int) numQuadro;
        hash = 53*hash +(int) numPassgMax;
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
