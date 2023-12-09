package aula4;
//Escreva um programaque leia do teclado uma frase e que apresente o seu acrónimo. 
//Considere que as iniciais de palavras com dimensão inferior a 3 caracteres não farãoparte do acrónimo
import java.util.Scanner;
import java.util.Arrays;
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o texto:");
        String s = input.nextLine();
        String[] splitS = s.split("\\W");
        System.out.println(Arrays.toString(splitS));//verificar
        System.out.println(abbreviation(splitS));
        input.close();

    }
    public static String abbreviation(String[] S){
        String abb="";
        for (int i = 0; i<S.length;i++){
            if (S[i].length()>=3){
                abb+=S[i].substring(0,1).toUpperCase();
            }

        }
        return abb;
    }
    

    
}
