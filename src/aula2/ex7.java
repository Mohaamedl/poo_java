package aula2;
import java.util.Scanner;
import java.lang.Math;
public class ex7 { //pretende-se determinar a distancia entre dois pontos no R^2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza as coordenadas x e depois y dos pontos p1 e p2 respectivamente: ");
        Double p1x = input.nextDouble(),p1y = input.nextDouble(),p2x = input.nextDouble(),p2y = input.nextDouble(),d;
        d = Math.sqrt(Math.pow(Math.abs(p1x-p2x),2)+Math.pow(Math.abs(p1y-p2y),2));
        input.close();
        System.out.format("A distancia entre p1 e p2 é: %.2f",d);

    }
    
}
