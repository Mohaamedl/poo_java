package exercicios;
import java.io.*;
import java.util.*;

public class Lernum {
    public static void main(String[] args) throws IOException {
        try{File file = new File("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/exercicios/numeros.txt");
        Scanner sn = new Scanner(file).useDelimiter("[\s]");
        Collection<Integer> nums = new ArrayList<>();
        while(sn.hasNext()){
            nums.add(Integer.parseInt(sn.next()));
        }
        sn.close();
        nums.stream().map(x->x+" ").forEach(System.out::print);
        System.out.println();
        int maxi = nums.stream().max(Comparator.naturalOrder()).get();
        int mini = nums.stream().min(Comparator.naturalOrder()).get();
        int medi = nums.stream().reduce(0,(sum,num)->sum+num)/nums.size();
        FileWriter fw = new FileWriter("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/exercicios/numeros_Stat.txt");
        PrintWriter pf = new PrintWriter(fw);
        pf.println(String.format("Valor minimo = %d\nValor maximo = %d\nMedia dos valores = %d\n",mini,maxi,medi));
        pf.close();
    
    
         }
         catch(FileNotFoundException e){
            System.out.println("File not found.");
         }
        
        
    }
}
