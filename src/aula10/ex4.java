package aula10;
import java.util.*;
import java.io.*;
public class ex4 {
    public static void main(String[]args) throws IOException {
        try{ Scanner input = new Scanner(new FileReader("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula10/words.txt")).useDelimiter("[,.;:\s\n\t]+");
        Collection<String> words = new ArrayList<>();
        while(input.hasNext()){
            words.add(input.next());
        }
        System.out.println(words);
        ArrayList<String> words2 = new ArrayList<>();
        words.stream().forEach(c->{if(c.length()>2){words2.add(c);} });
        System.out.println("------------------------------------------------------b)---------------------------------------------------------------------------");
        words2.stream().forEach(System.out::println);
        System.out.println("------------------------------------------------------c)---------------------------------------------------------------------------");
        words.stream().forEach(w->{if(w.endsWith("s")){System.out.println(w);}});
        System.out.println("------------------------------------------------------d)---------------------------------------------------------------------------");
        TreeSet<String> toremove= new TreeSet<>();
        for(String l:words){
            String[] s = l.split("[\s]*");
            for( String c :s){
                if(c.matches("[^a-zA-Z]")){
                    toremove.add(l);
                    break;
                }
            }
        }
        words.removeAll(toremove);
        System.out.println(words);
        }
        
        catch(FileNotFoundException e) {
            System.out.println("ficheiro nao encontrado");
        }
       
    }
    
}
