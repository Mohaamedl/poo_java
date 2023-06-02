package G1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("yoo bro");
        double d = 23.2323;
        float f = 32.3f;
        int i = 8;
        long ii = 34535345345L;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o teu nome? ");
        String nome = sc.nextLine();
        System.out.print("Que idade tens? ");
        int idade = sc.nextInt();
        System.out.print("Quanto pesas? ");
        double peso = sc.nextDouble();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + "Kgs."); 
        System.out.println(i+ii+f+d);
        sc.close();
        int a = 5;
        int b = -15;
        double c =(++a)-(b/30);
        System.out.println(c);
        int[][] matriz = {{4,3},{4,8}};
        System.out.println(matriz.length);
        String s = "ded ded d f e r f efefe eded efe";
        String[] ss = s.split("\s");
        for (String l : ss){
            System.out.println(l);
        }
        
        
    }
}
