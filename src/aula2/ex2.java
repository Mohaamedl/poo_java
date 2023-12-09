package aula2;
import java.util.Scanner;
public class ex2 { // passagem de celcius para fahrenheit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus Célsius?");
        double c = input.nextDouble();
        double f = 1.8*c + 32;
        input.close();
        System.out.format("atemperatura em graus Fahrenheit fica: %.1f ºF", f);

    }
    
}
