package aula2;
import java.util.Scanner;
public class ex1 { //passagem de distancia de km para milhas
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a distancia em km? : ");
        double d_km = input.nextDouble();
        double d_m = d_km/1.609;
        input.close();
        System.out.format("A distancia em milhas fica: %.3f milhas",d_m);
    }
    

    


}
