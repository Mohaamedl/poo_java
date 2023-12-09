package aula12;
import java.util.*;
import java.io.*;
public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        try{ArrayList<String> words = new ArrayList<>();
        TreeSet<String> words2 = new TreeSet<>(); 
        File file = new File("C:/Users/moham/OneDrive/Ambiente de Trabalho/.txt");
        Scanner sn = new Scanner(file).useDelimiter("[,.\s]+");
        while(sn.hasNext()){
            words.add(sn.next());
            
        }
        for(String w :words){
            words2.add(w);
        }
        sn.close();
        System.out.println(words);
        int a = words.size();
        int b = words2.size();
        System.out.printf("Numero total de palavras: %d\nNumero de paravras diferentes: %d",a,b);
        }
        catch(FileNotFoundException e) {
            System.out.println("Ficheiro nâo encntrado.");
        }
        

    }
}
