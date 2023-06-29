import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Tasquinha extends Tenda {
    public String nome;
    public int id;
    public String[] pratos = {};
    public Tasquinha(int id, String nome, String[] pratos) {
        this(id,nome);
        this.pratos = pratos;

    }

    public Tasquinha(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.pratos = new String[]{};

    }
    @Override
    public String toString() {
        
        return "Tasquinha [nome = %s, id = %d]";
    }
    public void addPrato(String prato) {
        List<String> pratoss = new ArrayList<String>(Arrays.asList(this.pratos));
        pratoss.add(prato);
        this.pratos =  pratoss.toArray(new String[pratoss.size()]);

    }

    public String items() {
        String s = "";
        for(String ss : this.pratos){
            s = s+ ", " +ss;
        }
        s = s.replaceFirst(",","[")+']';
        return s;
    }
    public String getNome() {
        return this.nome;
    }
    public static void main(String[] args) throws FileNotFoundException {
        List<String> pratoss = new ArrayList<String>(Arrays.asList(new String[]{"batata"})) ;
        pratoss.add("ue");
        System.out.println(pratoss);
       

    }
    

}
