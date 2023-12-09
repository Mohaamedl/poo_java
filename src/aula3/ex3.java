package aula3;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) { //numeros primos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza um numero inteiro positivo:");
        long n = input.nextLong();
        System.out.println(n);
        while (n<0){
            System.out.println("Introduza um numero inteiro positivo!");
            n = input.nextLong();
        }
        input.close();
        for (int i = 2; i<n;){
            if (n==2 || n==1){
                System.out.format("o numero %d é primo",n );
                break;

            }

            else if (n%i==0){
                System.out.format("o numero %d nao é um numero primo",n);
                break;
            }
            else {
                System.out.format("o numero %d é primo",n );
                break;
            }
           
            
        }
    }

    
}
