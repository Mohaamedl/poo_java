package aula2;
import java.util.Scanner;
import java.lang.Math;
public class ex8 { // calculo da hipotenusa e angulo entre esta e o primeiro cateto dados de um triangulo retangulo
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira o valor dos catetos a e b");
        double a = input.nextDouble(),b = input.nextDouble(),h,ang;
        
        h = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        ang = Math.acos(a/h)*180/Math.PI;
        input.close();
        System.out.format("O valor da hipotenusa é %.2f e o angulo entre esta e o cateto 'a' é %.2f graus",h,ang );
        
    }
    
}
