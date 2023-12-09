package aula7;

public class Retangulo extends Forma{
    protected double l1,l2;
    Retangulo(double l1,double l2,String cor){
        if(l1>0&&l2>0&&(l1<l2||l1>l2)){
            this.l1=l1;
            this.l2=l2;
            this.cor=cor;
            }
            else
                System.out.println("incorret parameteres.");
        
    }
    public double getL1() { return l1;}
    public double getL2() { return l2;}
    public void setL1(double l1) { this.l1 = l1;}
    public void setL2(double l2) { this.l2 = l2;}

    public double area(){
        return l2*l1;
    }
    public double perimetro(){
        return l1+l2;
    }
    public String toString(){
        return String.format("Retangulo %s  de lados %.2f  %.2f ; area = %.2f ; perimetro = %.2f",cor,l1,l2,area(),perimetro());

    }
    @Override
    public boolean equals(Forma obj) {
        
        Retangulo outro = (Retangulo) obj;
        
        if (l1!=outro.l1 || l2!=outro.l2) return false;

        return super.equals(outro);
    }
    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 53 * hash + (this.cor != null ? this.cor.hashCode() : 0);
        hash = 53 * hash + (int) this.l1;
        hash = 53 * hash + (int) this.l2;
        return hash;
        
    }
    
}
