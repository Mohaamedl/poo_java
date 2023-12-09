package aula7;

public class Triangulo extends Forma {
    double l1,l2,l3;
    Triangulo(double l1, double l2, double l3,String cor){
        try { 
            if(l1>0&&l2>0&&l3>0 &&  Math.abs(l1+l3)<=(Math.abs(l1)+Math.abs(l3))){
            this.l1=l1;
            this.l2=l2;
            this.l3=l3;
            this.cor=cor;
            }
        }
        catch(Exception e){ System.out.println("incorrect parameters.");}
    }
    public double getL1() { return l1;}
    public double getL2(){ return l2;}
    public double getL3(){ return l3;}
    public double area(){
        double p=(l1+l2+l3)/2;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }
    public double perimetro(){
        return l1+l2+l3;
    }
    public String toString(){
        return String.format("Traingulo %s de  lados = %.1f  %.1f  %.1f ; area = %.2f ; perimetro = %.2f",cor,l1,l2,l3,area(),perimetro());
    }
  
    public boolean equals(Forma obj) {
        Triangulo outro = (Triangulo) obj;
        if(l1!=outro.l1 || l2!=outro.l2 || l3!=outro.l3) return false;
        return super.equals(obj);
    }
    
    public int hashCode() {
        int hash = super.hashCode();
        hash = 53 * hash+ (int) l1;
        hash = 53 * hash + (int) l2;
        hash = 53 * hash + (int) l3;
        return hash;
    }
    
}
