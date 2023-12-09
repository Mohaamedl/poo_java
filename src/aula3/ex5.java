package aula3;
import static java.lang.Math.pow;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {// juros compostos com verificação de dados
        Scanner input = new Scanner(System.in);
        Double taxa, montante , meses =12.0;
        double acomulado;
        System.out.println("introduza a taxa de juros [0,5]:");
        taxa = input.nextDouble();
        System.out.println("introduza o montante:");
        montante = input.nextDouble();
        while (taxa  < 0 || taxa >5 || montante%1000!=0 || montante<0){
            System.out.println("introduza a taxa de juros [0,5]:");
            taxa = input.nextDouble();
            System.out.println("introduza o montante:");
            montante = input.nextDouble();
        }
        for (int i = 1; i<=meses;i++ ){
           
            acomulado = montante*(pow((1+(taxa/100)),i));
            System.out.printf("no mes nº %d acomulou: %.2f Euros \n",i,acomulado);
        }
        input.close();
    

    }
    
}
