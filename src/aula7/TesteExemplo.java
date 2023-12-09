package aula7;

public class TesteExemplo {
    public static void main(String[] args) {
        Exemplo e = new Exemplo(9);
        Exemplo ee= new Exemplo(9);
        Exemplo2 e2 = new Exemplo2(98);
        System.out.println(e.PI);
        System.out.println(ee==e);
        System.out.println(e2);
    }
    
}
