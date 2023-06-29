import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        return null;
    }
    public String[] nextEventsByDate() {
        return null;
    }
   
    

}
