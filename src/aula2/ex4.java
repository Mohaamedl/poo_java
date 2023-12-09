package aula2;
import java.util.Scanner;
import java.lang.Math;
public class ex4 { //juros compostos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indice o montante a investir e a taxa de juros respectivamente");
        double M =input.nextDouble(),Tx = input.nextDouble(),R;
        R = M*(Math.pow((1+Tx/100),3));
        input.close();
        System.out.format("um investimento de %.3f euros e taxa de %.2f %% ao fim de 3 meses terá %.3f euros",M,Tx,R);
        
    }
    
}
