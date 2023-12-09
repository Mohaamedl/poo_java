package aula7;

public class TestForma {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(12,20,"azul");
        Retangulo r1 = new Retangulo(12,20,"Azuel");
        Circulo R1 = new Circulo(10,"verde"), R2 =new Circulo(10,"vedrde");
        Triangulo t1 = new Triangulo(12,12,12,"rosa"), t2 = new Triangulo(12,12,12,"lilas");
        System.out.println(r.equals(r1));
        System.out.println(R1.equals(R2));
        System.out.println(t1.equals(t2));
    }
}
