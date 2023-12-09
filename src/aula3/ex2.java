package aula3;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {//output de numeros de x a 0
        Scanner sc = new Scanner(System.in);
        System.out.println("introduz um numero inteiro positivo para a contagem regressiva:");
        int n = sc.nextInt();
        while (n<0){
            n = sc.nextInt();
        }
        for (int i = n ; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();

    }
    
}
