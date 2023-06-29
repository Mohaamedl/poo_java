
public class Client {
    private String local;
    private String name;
    public Client(String name, String local) {
        this.name = name;
        this.local = local;
    }
    public String getLocal() {
        return local;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        String s = "Client [Name : "+name + ";  Local : "+local+']';
        return s;
    }
     
    

}
