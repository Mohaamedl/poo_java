package aula9; //aulas 6 e 7 atualizadas inluidas na pasta 
import aula6.Person;
import aula7.*;
import aula6.Date;
import java.util.*;
public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        c2.add("elefante");c2.add("maça");c2.add("gelato");c2.add("maça");
        System.out.println(c2.lastIndexOf("maça"));//5
        System.out.println(c2);
        System.out.println(c2.contains("Frio"));//false
        System.out.println(c2.contains("maça"));//true
        System.out.println(c2.indexOf("Vento"));//1
        Collections.sort(c2);
        c2.set(0,"pera");c2.set(4,"sabor");
        System.out.println(c2);
        System.out.println(c2.subList(3,6));
        c2.removeIf(l->(l.length()>4));
        System.out.println(c2);
        c2.removeAll(c2); 
        System.out.println(c2);
        //---------------------------------------------------------------------------------------------------------







        Set<Person>  c3 = new HashSet<>();
        Date d1=new Date(1,1,2001);
        Date d2=new Date(2,4,2003);
        Date d3=new Date(3,6,2001);
        Date d4=new Date(4,1,2001);
        Date d5=new Date(5,2,2001);
        Date d6 = new Date(1,1,2001);
        Person e1 = new Person("joao1", 9243824, d1);
        Person e2 = new Person("joao2", 1972409, d2);
        Person e3 = new Person("joao3", 9243824, d3);
        Person e4 = new Person("joao4", 98656567, d4);
        Person e5 = new Person("joao5", 90897824, d5);
        Person e6 = new Person("joao1", 9243824, d1);
        
        c3.add(e1);c3.add(e2);c3.add(e3);c3.add(e4);c3.add(e5);c3.add(e1);c3.add(e6);
        Iterator<Person> itc3 =c3.iterator();

        System.out.println(c3);
        while(itc3.hasNext()){
            System.out.println(itc3.next());
        
        }

        //---------------------------------------------------------------------------------------------------------
        Set<Date> c4 =new TreeSet<>();
        c4.add(d1);c4.add(d2);c4.add(d3);c4.add(d4);c4.add(d5);c4.add(d6);
        System.out.println(c4);
        Set<DateYMD> c5 = new TreeSet<>();
        DateYMD n1 = new DateYMD(1, 2, 2010);
        DateYMD n2 = new DateYMD(4, 3, 2010);
        DateYMD n3 = new DateYMD(23, 4, 2010);
        DateYMD n4 = new DateYMD(12, 1, 2020);
        DateYMD n5 = new DateYMD(5, 8, 2021);
        c5.add(n1);c5.add(n2);c5.add(n3);c5.add(n4);c5.add(n5);
        System.out.println(c5);
        Set<DateND> c6 = new TreeSet<>();
        DateND t1 = new DateND(28, 11, 2020);
        DateND t2 = new DateND(12, 8, 2020);
        DateND t3 = new DateND(4, 4, 2020);
        DateND t4 = new DateND(12, 5, 2030);
        DateND t5 = new DateND(5, 2, 2041);
        c6.add(t1);c6.add(t2);c6.add(t3);c6.add(t4);c6.add(t5);
        System.out.println(c6);



    }
    
}
