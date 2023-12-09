package aula3;
import java.util.Scanner;
import java.util.Random;
/*O jogo AltoBaixoconsiste em tentar adivinhar um número (inteiro) entre 1 e 100.
O programa escolhe um número aleatoriamente. Depois, o utilizador insere uma tentativa eo programa
indica se é demasiado alta, ou demasiado baixa. Isto é repetido até o utilizador acertar no número.
O jogo deve indicar quantas tentativas foram feitas e de seguida perguntar: “Pretende continuar? Prima(S)im”.
 O programa termina caso a resposta seja diferente de “S”ou “Sim”. Sugestão: para ler uma palavra utilize o 
método next: String resposta = sc.next();.*/
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random  rand = new Random();
        int ran = rand.nextInt(1,101),num;
        System.out.println("jogo AltoBaixo \nIntroduza 'S' ou 'Sim' para jogar");
        String inc = input.next();
        System.out.println(inc);
        System.out.println("Introduza um numero de 1 a 100 inclusive:");
        if (inc.equals("S") || inc.equals("Sim")){
            num = input.nextInt();
            while (num!=ran && (inc.equals("Sim") || inc.equals("S"))){
                System.out.println(AltoBaixo(ran,num));
                System.out.println("Pretende continuar? (prima 'Sim' ou 'S')");
                inc = input.next();
                num = input.nextInt();
            }
            System.out.println("Parabens acertou!!");
            System.out.println("Pretende Jogar novamente? (prima 'Sim' ou 'S')");
            inc = input.next();
        }
        else
            System.out.println("Adeus!");
        
        input.close();
    }
    
        

    
    public static String AltoBaixo(int r,int x){
        String R="";
        if (x>r){
            R = "O numero que introduziu é Alto";
        }
        else if (x<r){
            R = "O numero que introduziu é Baixo";
        }
        return R;
        
    }
}
