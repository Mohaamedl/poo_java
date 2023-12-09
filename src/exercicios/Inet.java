package exercicios;
import java.util.*;
interface Bomm{
    String SumS(String s);
}
interface Iteiro{
    int resto0(int n);
}
interface Iteiro0<Y>{
    Y resto0(Y n,Y m);
}
interface Comp<Y>{
    int compa(Y n,Y m);
}






















public class Inet {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i =1;i<1001;i++){list.add(i*Math.random());}
        // Código que adiciona 1000 elementos na lista
        // Acrescente aqui o código que permita ordenar a lista lst
        list= list.stream().sorted().toList();

        list.forEach(System.out::println);

        String[] vec = new String[] { "once", "upon", "a", "time", "in", "Aveiro" };
        // Acrescente aqui o código que permita ordenar o vetor vec
        Arrays.sort(vec);


        for (String s : vec) System.out.print(s+" ");
    }

}
