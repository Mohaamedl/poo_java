package aula11;

public class Voo implements Comparable<Voo> {
    protected String hora, voo, companhia, origem, atraso,obs;
    public Voo(String hora,String voo,String companhia,String origem,String atraso,String obs){
        this.hora=hora;
        this.voo=voo;
        this.companhia=companhia;
        this.origem=origem;
        this.atraso=atraso;
        this.obs=obs;
    }
    public String getAtraso() {
        return atraso;
    }
    public String getCompanhia() {
        return companhia;
    }
    public String getHora() {
        return hora;
    }
    public String getObs() {
        return obs;
    }
    public String getOrigem() {
        return origem;
    }
    public String getVoo() {
        return voo;
    }
    public String toString() {
        
        return String.format("%10s%15s%25s%25s%10s%20s",hora,voo,companhia, origem, atraso,obs);
    }

    public boolean equals(Object obj) {
        if(obj ==this) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        Voo outro = (Voo) obj;
        if(!outro.hora.equals(this.hora)
        ||!outro.voo.equals(this.voo)||!outro.companhia.equals(this.companhia)
        ||!outro.origem.equals(this.origem)||!outro.atraso.equals(this.atraso)
        ||!outro.obs.equals(this.obs)) return false;
        return true;
    }
   
    public int hashCode() {
        int hash = 3;
        hash= 53*hash +(this.hora!=null? this.hora.hashCode():0);
        hash= 53*hash +(this.voo!=null? this.voo.hashCode():0);
        hash= 53*hash +(this.companhia!=null? this.companhia.hashCode():0);
        hash= 53*hash +(this.origem!=null? this.origem.hashCode():0);
        hash= 53*hash +(this.atraso!=null? this.atraso.hashCode():0);
        hash= 53*hash +(this.obs!=null? this.obs.hashCode():0);
        return hash;
       
    }
 
    public int compareTo(Voo obj) {
        return this.hora.compareToIgnoreCase(obj.hora);
    }
    
}
