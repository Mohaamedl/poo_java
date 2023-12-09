package exercicio_aula11;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RandomBooks {
    protected Map<Person,ArrayList<Book>> lista = new HashMap<>() ;
    protected ArrayList<Book> books ;
    protected ArrayList<Book> bookss = new ArrayList<>();
    public RandomBooks() {
        books=new ArrayList<>() ;
        try{
            ArrayList<String> lines =(ArrayList<String>) Files.readAllLines(Paths.get("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/exercicio_aula11/books.csv"));
            lines.stream().forEach(c->{String[] s = c.split(";");books.add(new Book(s[0],s[1],s[2]));});
            lines.stream().forEach(System.out::println);
        }
        catch(Exception e ){System.out.println("ficheiro nao existe");}
    }
    public void getRandomBook(Person person) {
        
        int i = (int) Math.random()*books.size();
        bookss.add(books.get(i));
        lista.put(person,bookss);
    }
    public void listReaders(){  
        lista.keySet().stream().forEach(c->System.out.println(c.toString()+"\n"+lista.get(c)));
    }
}
