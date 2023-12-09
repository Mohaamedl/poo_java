package aula7;

public class Circulo extends Forma {
    protected double r;
    public Circulo(int r,String cor){
        this.r=r;
        this.cor=cor;
    }
    public double getr() {
        return r;
    }
    public double perimetro(){
        return super.PI2*r;
    }
    public double area() {
        return Math.PI*r*r;
    }
    public String toString() {
        return String.format("Circulo %s de raio = %.2f ; area = %.2f ; perimetro = %.2f",cor,r,area(),perimetro());
    }
    @Override
    public boolean equals(Forma obj) {
        Circulo outro = (Circulo) obj;
        if (r!=outro.r) return false;
        return super.equals(obj);
    }
    
}
