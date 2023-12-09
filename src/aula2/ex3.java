package aula2;
import java.util.Scanner;
public class ex3 { // energia necessaria para variar x temperatura de m massa de agua
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza: temperatura inicial(Cº), final(Cº) e a massa (kg) de agua nesta ordem");
        double tI = input.nextDouble(),tF = input.nextDouble(),M = input.nextDouble(),Q;
        Q = (tF-tI)*M*4184;
        input.close();
        System.out.format("A energia necessaria é %.2e J",Q);
    }
    
}
