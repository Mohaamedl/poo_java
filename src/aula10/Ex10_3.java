package aula10;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;




public class Ex10_3 {
    public static void main(String[] args){
        String s = "Batata doce,maça,laranja,tomate,limao,ananas";
      
        Map<Character,List<Integer>>  mapa = new HashMap<>();
        for(int i =0;i< s.length() ;i++){
            char ch = s.charAt(i);
            List<Integer> indices = IntStream.iterate(s.indexOf(ch), l -> l != -1,l -> s.indexOf(ch, l + 1))
                                    .boxed().collect(Collectors.toList());
            mapa.put(s.charAt(i),indices);

        }
        System.out.println(mapa);
       

    }
}
