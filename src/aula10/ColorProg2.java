package aula10;
import java.util.*;
public class ColorProg2 {
    public static void main(String[] args) {
        TreeMap<String,ArrayList<String>> cores2 = new TreeMap<>();
        ArrayList<String> sig = new ArrayList<>();
        ArrayList<String> sig1 = new ArrayList<>();
        ArrayList<String> sig3 = new ArrayList<>();
    

        sig.add("cor de neve");sig.add("cor de gaivota");
        sig1.add( "cor do mar");sig1.add("cor do ceu");sig1.add("cor de neptuno");
        sig3.add("cor da terra");sig3.add("cor do barro");
        cores2.put("azul",sig1); 
        cores2.put("branco",sig);
        cores2.put("castanho",sig3);
        
        System.out.println(cores2);
        System.out.println(randocolor(cores2,"azul"));

    }
        

    static String color="";
    public static String randocolor(TreeMap<String,ArrayList<String>> cores2,String s){
        
        cores2.entrySet().stream().forEach(c->{if(c.getKey().equals(s)){color = c.getValue().get((int) (Math.random()*c.getValue().size()));} });
        return color;
    }
       
}
