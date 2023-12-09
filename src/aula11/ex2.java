package aula11;
import java.util.*;
import java.io.*;
public class ex2 {
    public static void main(String[] args) throws IOException {
      try{
        //a)--------------------------------------------------------------------------------------------------------------------
        File filevoos = new File("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula11/voos.txt");
        File filecomp = new File("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula11/companhias.txt");
        Scanner snv =new Scanner(filevoos);
        Scanner sncomp = new Scanner(filecomp);
        Collection<Voo> voos = new ArrayList<>();
        TreeMap<String,String> compan = new TreeMap<>();
        sncomp.nextLine();
        String[] ins =snv.nextLine().split("\t");
        while(sncomp.hasNextLine()){
            String[] s = sncomp.nextLine().split("\t");
            compan.put(s[0],s[1]);
        }
        sncomp.close();

        while(snv.hasNextLine()){
            String[] s = snv.nextLine().split("\t");
            if(s.length<4){voos.add(new Voo(s[0],s[1],(String) compan.get(s[1].substring(0,2)) , s[2], "",""));}
            else voos.add(new Voo(s[0],s[1],compan.get(s[1].substring(0,2)) , s[2], s[3], previsao(s[0], s[3])));
        }
        snv.close();
        //b)--------------------------------------------------------------------------------------------------------------------
        FileWriter fw = new FileWriter("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula11/infopublico.txt");
        PrintWriter pf = new PrintWriter(fw);
        
        pf.append(String.format("%10s%15s%25s%25s%10s%20s\n\n",ins[0],ins[1],"Companhia",ins[2],ins[3],"Observações"));
        voos.forEach(s->{pf.append(s.toString()+"\n"); });
        pf.close();
        //c)--------------------------------------------------------------------------------------------------------------------------
        Collection<String> comps = new ArrayList<>();TreeMap<String,String> atrasos = new TreeMap<>();
        voos.stream().forEach(v -> {if(!comps.contains(v.companhia)) {comps.add(v.companhia);}});
        for( String compa:comps){
            ArrayList<String> inc = new ArrayList<>();
            for( Voo voo:voos){
                if(voo.companhia==compa&&voo.atraso.length()==5){
                    inc.add(voo.atraso);
                }
            }
            if(!inc.isEmpty()&&compa!=null){atrasos.put(compa,mediaAtrasos(inc));}
        }
        atrasos.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        //d)---------------------------------------------------------------------------------------------------------------------------------------
        FileWriter fw2 = new FileWriter("C:/Users/moham/OneDrive/Ambiente de Trabalho/java_vscod/src/aula11/cidades.txt");
        PrintWriter printcid = new PrintWriter(fw2);
        printcid.println("Cidade                     Atraso\n");
        Collection<String> cidades =new TreeSet<>(); TreeMap<String,Integer> countCidades= new TreeMap<>();
        voos.stream().forEach(v->cidades.add(v.origem));
        
        for(String ci : cidades){
            int f=0;
            for(Voo v:voos){
                if(v.origem.equals(ci)){f++;}
            }
            countCidades.put(ci,f);
        }
        countCidades.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(c->printcid.append(String.format("%-25s%5d\n",c.getKey(),c.getValue())));
        printcid.close();
      }
      catch(FileNotFoundException e){
        System.out.println("File not found.");
      }
    }










    public static String mediaAtrasos(ArrayList<String> s){
        int sumHoras=0,sumMins=0;
        for(String ss:s){
            sumHoras += (int) Integer.parseInt(ss.substring(0,2));
            sumMins += (int) Integer.parseInt(ss.substring(3,5));
        }
        if(sumMins/s.size()>=10)
        return (sumHoras/s.size())+":"+(sumMins/s.size());
        else
        return (sumHoras/s.size())+":0"+(sumMins/s.size());
    }



    public static String previsao(String horaa,String atraso){
        int horas = (int) Integer.parseInt(horaa.substring(0,2)), horasat = (int) Integer.parseInt(atraso.substring(0,2));
        int min = (int) Integer.parseInt(horaa.substring(3,5)), minat = (int) Integer.parseInt(atraso.substring(3,5));
        
        if( horas+horasat>23&&min+minat>=60)
            return ((horas+horasat)%24+1)+":"+((min+minat)-60);
        else if(horas+horasat>23)
            return ((horas+horasat)%24)+":"+(min+minat);
        else if(horas+horasat+1>23&& min+minat>=60)
            return ((horas+horasat+1)%24)+":"+(min+minat-60);
        else if(min+minat>=60)
            return (horas+horasat+1)+":"+(min+minat-60);
        
        return (horas+horasat)+":"+(min+minat);
    }
}