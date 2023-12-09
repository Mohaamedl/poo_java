package aula8;

public class TestVeiculos {
    public static void main(String[] args){
        
        Empresa e1 = new Empresa("BMW","1234-123","edioahdiuwh@BMW.com");
        Motociclo m1 = new Motociclo("de-23-fr","BMW","GT32", 1000,"Desportivo");
        Motociclo m2 = new Motociclo("de-26-fr","BMW","GT32", 10900,"Estrada");
        AutoLigeiro a1 = new AutoLigeiro("sd-34-fs", "BMW", "SERF", 1400, 4, 30);
        AutoLigeiro a2 = new AutoLigeiro("sd-64-ys", "BMW", "uiyRF", 1000, 78, 830);
        PesadoMerc p1 = new PesadoMerc("sd-34-gt","BMW","hujiiimon",2000,5,2300,3000);
        PesadoMerc p2 = new PesadoMerc("sd-24-gt","BMW","hujiiimon 2.0",3000,5,4300,4000);
        PesadoPassg p3 = new PesadoPassg("ht-23-fe","BMW", "judet", 2000,23,30,2000);
        PesadoPassg p4 = new PesadoPassg("ht-63-gt","BMW", "gtfr", 2090,23,20,2000);
        e1.motociclos.add(m1);e1.motociclos.add(m2);
        e1.autoLigieros.add(a1); e1.autoLigieros.add(a2);
        e1.pesadosMerc.add(p1);e1.pesadosMerc.add(p2);
        e1.pesadoPassgs.add(p3);e1.pesadoPassgs.add(p4);

        e1.autoLigieros.get(1).setCapacidadeBag(70);
        System.out.println(e1);
        System.out.println(m1.getMarca()+" "+e1.motociclos.get(0).getModelo());
        
        
        
    }
    
}
