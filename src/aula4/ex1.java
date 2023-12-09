package aula4;
/*
Construaum programa que leiaumaString(uma palavra, fraseou parágrafo)
e que apresente, usando exclusivamente métodos da classe String:
•uma nova frase, convertida para minúsculas;
•oúltimo carater da frase;
•os 3 primeiros carateres.
•Utilize ainda outros métodos da classe String(no mínimo, mais três) 
e verifique o seu resultado no programa.
*/
import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="";
        System.out.println("Introduza o texto, terminando com espaço '.' ");
        while (input.hasNextLine()){
            String s1 = input.next();
            if (s1.equals(".") ) break;
            s +=" "+s1;
            //if (s1.endsWith(".")) break;
        }
        input.close();
        s=s.trim(); //tirar espaço lateral
        System.out.println(s);
        System.out.format("\nem mausculas fica: %s\no ultimo caracter é '%s' \ne os tres primeiros char sao: %s",
        s.toUpperCase(),s.charAt(s.length()-1),s.substring(0,3));
        System.out.format("\nsem espaços fica: %s\ntrocando os 'o' por 'u' fica : %s \ne se tem 'ola' na string : %s",
        s.replace(" ",""),s.replace('o','u'),s.contains("a")? "sim":"nao");


    }




}
