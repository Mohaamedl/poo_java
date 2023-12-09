package aula12;
import java.util.*;
import java.io.*;
public class ex2 {
    public static void main(String[] args) throws IOException {
        //b)
        try{
        Collection<Movie> movies =  new TreeSet<>();
        File file = new File("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula12/movies.txt");
        Scanner sn = new Scanner(file);
        String[] s2 = sn.nextLine().split("\t");
        System.out.printf("%40s%10s%12s%12s%20s\n",s2[0],s2[1],s2[2],s2[3],s2[4]);
        while(sn.hasNext()){
            String[] s = sn.nextLine().split("\t");
            Movie ss = new Movie(s[0],(double) Double.parseDouble(s[1]),s[2],s[3],(int) Integer.parseInt(s[4]));
            movies.add(ss);
        }
        sn.close();
        movies.stream().forEach(System.out::println);
        System.out.println("------------------------------------------------c1--------------------------------------------------------------");
        movies.stream().sorted(Comparator.comparing(Movie::getScore).reversed()).forEach(System.out::println);
        System.out.println("--------------------------------------------------c2------------------------------------------------------------");
        movies.stream().sorted(Comparator.comparing(Movie::getRunningTime)).forEach(System.out::println);
        System.out.println("--------------------------------------------   d)   --------------------------------------------------------------");
        TreeSet<String> mn = new TreeSet<>();
        movies.stream().forEach(moviess -> {if(!mn.contains(moviess.genre)){ System.out.println(moviess.genre);mn.add(moviess.genre);}});
        System.out.println("-------------------------------------------------e)------------------------------------------------------------------");
        FileWriter wfile = new FileWriter("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula12/myselection.txt",true);
        PrintWriter printfile = new PrintWriter(wfile);
        printfile.println("The best Comedy films:");
        for (Movie n : movies){
            if(n.score>60 && n.genre.equals("comedy")){
                printfile.append(n.toString());
                printfile.append("\n");
            }
            
        }
        
        printfile.close();
        System.out.println("Done!");
        }
        catch(FileNotFoundException e){
            System.out.println("Fichiro não encontrado.");
        }
    }
}
