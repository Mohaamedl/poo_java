package aula8;

public class Motociclo extends VeiculosMotorizados implements KmPercorridosInterface {

    protected String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia,String tipo){
        super(matricula,marca,modelo,potencia);
        try{
            if(tipo.equalsIgnoreCase("Desportivo")||tipo.equalsIgnoreCase("Estrada")){
                this.tipo=tipo;
            }
        }
        catch(Exception e){System.out.println("Dados invalidos..");} 
    }
   
    public String toString() {
        
        return "Motociclo\n"+super.toString()+"tipo: "+tipo+"\n";
        
    }
    
    public boolean equals(Motociclo obj) {
        Motociclo outro = (Motociclo) obj;
        if (!outro.tipo.equalsIgnoreCase(obj.tipo)) return false;
        return super.equals(obj);
    }
    public int hashCode(Motociclo obj) {
        
        int hash = super.hashCode();
        hash = 53*hash+ (this.tipo!=null? this.tipo.hashCode():0);
        return hash;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
