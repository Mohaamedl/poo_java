package aula7;

public abstract class Forma {
    protected double PI2 = Math.PI*2;
    protected String cor;
    public abstract double perimetro();
    public abstract double area();
    public abstract String toString();
    public boolean equals(Forma obj){
        if (this ==obj) return true;
       
        if (obj==null) return false;
       
        if (getClass() != obj.getClass()) return false;
       
        Forma outro = (Forma) obj;
        if (!cor.equalsIgnoreCase(outro.cor)) return false;
        return true;
    }
    public int hashCode() {
        int hash=3;
        hash = 53 * hash + (this.cor != null ? this.cor.hashCode() : 0);
        return hash;
    }

}
