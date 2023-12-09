package aula8;

public abstract class VeiculosMotorizados {
    protected String matricula, marca, modelo;
    protected int potencia;
    public VeiculosMotorizados(String matricula, String marca, String modelo, int potencia){
        try{
            if(matriculaValida(matricula) && potencia>0){
                this.matricula=matricula;
                this.marca=marca;
                this.modelo=modelo;
                this.potencia=potencia;
            }
        }
        catch(Exception e) { 
            System.out.println("Dados invalidos...");
        }
    }
    public String getMarca() {
        return marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
    public String toString() {
        
        return String.format("Matricula: %s\nMarca e modelo: %s %s\nPotencia: %d\n",matricula,
        marca,modelo,potencia);

    }
    
    public boolean equals(VeiculosMotorizados vm) {
        if (this==vm) return true;
        if (vm==null) return false;
       
        if (getClass() != vm.getClass()) return false;
       
        VeiculosMotorizados outro = (VeiculosMotorizados) vm;
        if (!matricula.equalsIgnoreCase(outro.matricula)) return false;
        if (!marca.equalsIgnoreCase(outro.marca)) return false;
        if (!modelo.equalsIgnoreCase(outro.marca)) return false;
        if (this.potencia !=outro.potencia) return false;
        return true;
      
    }
    public int hashcode(){
        int hash= 3;
        hash = 53*hash+(this.matricula!=null? this.matricula.hashCode(): 0);
        hash = 53*hash+(this.marca!=null? this.marca.hashCode(): 0);
        hash = 53*hash+(this.modelo!=null? this.modelo.hashCode(): 0);
        hash = 53*hash+(int) this.potencia;
        return hash;
    }

    public static boolean matriculaValida(String matricula){
        if(matricula.matches("\\D{2}-\\d{2}-\\D{2}") && matricula.length()==8) return true;
        else return false; 
    }
}
