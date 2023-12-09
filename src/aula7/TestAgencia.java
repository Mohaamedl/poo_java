package aula7;

public class TestAgencia {
    public static void main(String[] args){
        Agencia a1 = new Agencia("AAStars","Rua dr. mario");
        a1.apartamento[0] = new Apartamento("89di2uej9","apartamento 1", "rua dr.mario 2 andar", 39.99,5,true, 4);
        a1.apartamento[1] = new Apartamento("86di2jçe9","apartamento 2", "rua dr.mario 2 andar", 29.99,4,false, 2);
        a1.quarto[0] = new Quarto("whg567rttry5","quarto 1", "rua dr.mario 2 andar", 10.99,3.6,true,"single" );
        a1.quarto[1] = new Quarto("whrj567htrtry5","quarto 2", "rua dr.mario 2 andar", 12.99,3.7,false,"double" );
        a1.quarto[2] = new Quarto("rturt657ttry5","quarto 3", "rua dr.mario 2 andar", 14.99,3.9,true,"twin" );
        a1.quarto[3] = new Quarto("rh54ttry5","quarto 4", "rua dr.mario 2 andar", 16.99,4.3,true,"triple" );
        System.out.println("_____________________________________Apartamentos_________________________________________________");
        System.out.println(a1.apartamento[0].toString());
        a1.apartamento[0].check_in();
        System.out.println("");
        System.out.println(a1.apartamento[0].toString());
        a1.apartamento[0].check_out();
        System.out.println("");
        System.out.println(a1.apartamento[0].toString());
        a1.apartamento[0].setAvalicao(4.5);
        System.out.println("");
        System.out.println(a1.apartamento[0].toString());
        System.out.println(a1.apartamento[1].toString());
        System.out.println("_______________________________________Quartos___________________________________________________");
        System.out.println(a1.quarto[0].toString());
        a1.quarto[0].check_in();
        System.out.println("");
        System.out.println(a1.quarto[0].toString());
        a1.quarto[0].check_out();
        System.out.println("");
        System.out.println(a1.quarto[0].toString());
        a1.quarto[0].setAvalicao(4.5);
        System.out.println("");
        a1.quarto[3].setPrecoNoite(20.99);
        System.out.println(a1.quarto[0].toString());
        System.out.println(a1.quarto[1].toString());
        System.out.println(a1.quarto[2].toString());
        System.out.println(a1.quarto[3].toString());
        
        
        







    }
    
    
}
