package aula3;
import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("introduza um conjunto de valores terminando com um valor igual ao primeiro");
        double n1 = input.nextDouble(),n2 = input.nextDouble(),min,max,media;
        
        double [] L = new double[1000]; // um array para suportar os numeros introduzidos
        L[0] = n1;
        L[1] = n2; //adiciona-se os primeiros 
        int i = 2; // inicio do ciclo 2 pois os indices 0 e 1 ja foram colocados
        while (n2!=n1) { 
            n2 = input.nextDouble();
            L[i]=n2; // adicionas-se tds os numeros do utilizador no array
            i++;
        }
        input.close();
        min = Arrays.stream(L).min().getAsDouble(); // metodos para achar o min, max e soma
        max = Arrays.stream(L).max().getAsDouble();
        media = Arrays.stream(L).sum()/(i);
        System.out.format("introduziu %d numeros, a media do conjunto foi %.2f , o menor numero foi %3.2f e o maior foi %3.2f", i,media,min,max);


    }
    
}
