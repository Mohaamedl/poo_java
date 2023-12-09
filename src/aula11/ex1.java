package aula11;
import java.io.*;
import java.util.*;


public class ex1 {
    public static void main(String[] args) {
       try{
       File f1 = new File("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/test.txt");
       Scanner input = new Scanner(f1);
       ArrayList<String> words = new ArrayList<>();
       
       while(input.hasNext()){
           String[] s = input.nextLine().split("[\s\t\n.,:;'‘’?!-\\*\\{\\}=\\+\\&/\\(\\)\\[\\]\\”\\“\\'\"]+");//\t\n.,:'‘’;?!-*{}=+&/()[]”“\"\' como separador 
           for (String n:s){
            if (n.length()>=3) words.add(n);
           }
       }
       input.close();
       TreeMap<String,TreeMap<String,Integer>> w = new TreeMap<>();
       
       for(int i =0;i<words.size()-1;i++){
            TreeMap<String,Integer> m = new TreeMap<>();
            int l =1;
            for(int j =0;j<words.size()-1;j++){
                
                if((words.get(i)).equals(words.get(j))){
                    if (m.containsKey(words.get(j+1))) l++;
                    m.put(words.get(j+1),l);
                }
            }
            w.put(words.get(i),m);
       }
       System.out.println(w);
       }
       catch(FileNotFoundException e) {
           System.out.println("Ficheiro nao existe.");
       }
    }
    
}
