import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner events = new Scanner(new File("events.txt")); 
        EventManager em = new EventManager("Funny Sports"); // modificar
		
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
                    case "Catering": 
                    case "Culture":
                }
                System.out.println(e);

            }


        }

    }
}
