import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    
    public static void main(String[] args) throws Exception {
        EventManager em = new EventManager("Funny Sports"); // modificar
        try{
            Scanner events = new Scanner(new File("events.txt")); 
            
            Event e=null ;
            while(events.hasNext()){
                String line = events.nextLine();
                String[] data ;
                
                if (line.startsWith("#")){
                    data = line.replace("#","").replace(" ", "").split(",");
                    Client c = em.addClient(data[0], data[1]);
                    e = em.addEvent(c, LocalDate.parse(data[2]) );
                    

                }
                else if(line.startsWith("*") && e!=null){
                    data = line.replace("*","").replace(" ", "").split(",");
                    switch(data[0]){
                        case "Sport": e.addActivity(new Sport(Sport.Modality.valueOf(data[1]),Integer.parseInt(data[2])));
                        break;
                        case "Catering": e.addActivity(new Catering(Catering.Option.valueOf(data[1]),Integer.parseInt(data[2])));
                        break;
                        case "Culture": e.addActivity(new Culture(Culture.Option.valueOf(data[1]),Integer.parseInt(data[2])));
                        break;
                    }
                    

                }
            }
            System.out.println(em);

        }catch(IOException e){ System.out.println("Error:" +e);

        }
        String[] clientsWE =  ( em.getEvents().stream().sorted(Comparator.comparing(Event::getParse))).map(String::valueOf).collect(Collectors.toList()).toArray(String[]::new);
        for(String s:clientsWE) System.out.println(s);
        System.out.println();
        em.getEvents().forEach(System.out::println);
        
        
    

    }
}
