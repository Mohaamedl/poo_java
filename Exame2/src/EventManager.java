import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventManager {
    private String name;
    private List<Client> clients = new ArrayList<Client>();
    private List<Event> events =  new ArrayList<Event>();
    // construtor 
    public EventManager(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public List<Client> getClients() {
        return clients;
    }
    public List<Event> getEvents() {
        return events;
    }
    public String toString(){
        String s = "Event Manager\nClients:[ ";
        for (Client c :clients) s=s+"  "+c.toString();
        s=s+"]\nEvents: [";
        for (Event e :events) s=s+"  "+e.toString();
        s=s+']';
        return s;
    }

    
    










    public Client addClient(String name, String local) {
        Client client = new Client(name,local);
        clients.add(client);
        return client;
    }
    public Event addEvent(Client c, LocalDate parse) {
        Event event = new Event(c,parse);
        events.add(event);
        return event;
    }
    public List<Client> listClients() {
        return clients;
    }
    public List<Event> listEvents() {
        return events;
    }
    public String[] clientsWithEvents() {
        String[] clientsWE =  events.stream().map(s->s.getClient().toString()).collect(Collectors.toList()).toArray(new String[events.size()]);
        return clientsWE;
    }
    public String[] nextEventsByDate() {
        String[] clientsWE =  events.stream().sorted(Comparator.comparing(Event::getParse)).map(String::valueOf).collect(Collectors.toList()).toArray(String[]::new);
        
        return clientsWE;
    }
   
    

}
