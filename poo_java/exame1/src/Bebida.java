
public class Bebida {
    public String nome;
    public double alcool;
    public Bebida(String nome, double alcool) {
        this.nome = nome;
        this.alcool = alcool;
    }
    public double getAlcool() {
        return alcool;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return String.format(" Bebida  [nome = %s, teorAlcool= %s]",this.nome,this.alcool );
    }
    @Override
    public boolean equals(Object obj) {
         if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Bebida))
            return false;

        final Bebida other = (Bebida) obj;
       
        if (this.nome != other.nome) {
            return false;
        }
        if (this.alcool != other.alcool) {
            return false;
        }

        return true;
        
    }
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int hash = hashCode()* PRIME;
        hash = hash * PRIME + (int) ((int) alcool ^( (int) alcool>>>32));
        hash = hash * PRIME + (nome==null? 0:nome.hashCode());
        return hash;
    }
    
    

}
