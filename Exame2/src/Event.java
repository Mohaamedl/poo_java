import java.time.LocalDate;

public class Event {
    private Client client;
    private LocalDate parse;


    public Event(Client client, LocalDate parse) {
        this.client = client;
        this.parse = parse;
    }

    public Event addActivity(Ativity sport) {
        return this;
    }
    public String toString(){
        return "Event " + client.toString() +", data: "+parse;
    }

}
