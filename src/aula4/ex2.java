package aula4;
/*
Construa um programa que leia uma frase. 
Adicionalmente, construa métodos estáticos e use-os na função main, 
para realizar cada uma das operações seguintes:
•conte o número de carateres numéricos (0..9) 
da String;Ex: public static int countDigits(String s){...}
•conte quantos espaçoscontém;
•indique se só contém minúsculas;
•devolvauma String, onde todas as ocorrências de vários espaços seguidos são substituídas por um único espaço;
•indique se a String é um palíndromo.
*/
import java.util.Scanner;
public class ex2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        System.out.println(countDigits(s));
        System.out.println(countSpaces(s));
        System.out.println(justCapitalLetters(s));
        System.out.println(subsSpaces(s));
        System.out.println(isPalindrome(s));
    }
    
    //------------------------------------------------------------------------------------------------------------------
    public static int countDigits(String s){
        int n =0;
        for (int i = 0; i<s.length();i++){
            if (s.substring(i,1+i).matches("\\d")) n+=1;
        }
        return n;
    }
    //---------------------------------------------------------------------------------------------------------------
    public static int countSpaces(String s){
        int n=0;
        for (int i = 0; i<s.length();i++){
            if (s.substring(i,1+i).matches("\\s")) n+=1;
        }
        return n;
    }
    //----------------------------------------------------------------------------------------------------------------------
    public static boolean justCapitalLetters(String s) {
        boolean V=true;
        for (int i = 0; i<s.length();i++){
            if (s.substring(i,1+i).equals(s.substring(i,1+i).toUpperCase())) V = true;
            else {V = false;break;}
        }
        return V;
    }
    //------------------------------------------------------------------------------------------------------------------
    public static String subsSpaces(String s) {
        
        return s.replaceAll("\\s{2,}"," ");
    }
    //--------------------------------------------------------------------------------------------------------------------
    public static boolean isPalindrome(String s){
        boolean v = true;
        for (int i =0;i<=s.length()/2 -1;i++){
            if (s.substring(i,1+i).equals(s.substring(s.length()-1-i,s.length()-i))) v = true;
            else v =false;
        }
        return v;
    } 
    
}
