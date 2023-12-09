package aula10;

import java.util.*;

public class ColorProg {
    public static void main(String[] args){
        TreeMap<String,String>corSig = new TreeMap<>();
        corSig.put("branco","cor de neve");corSig.put("azul","cor do ceu");corSig.put("castanho","cor de terra");corSig.put("verde","cor de pantano");corSig.put("vermelho","cor do sangue");corSig.put("rosa","cor de camarao");
        corSig.remove("branco");
        corSig.put("branco","cor da neve");
        corSig.replace("branco", "cor da gaivota");
        System.out.println(corSig);
        System.out.println("cores: "+corSig.keySet());
        System.out.println("Significados: "+corSig.values());

    }
    
}
