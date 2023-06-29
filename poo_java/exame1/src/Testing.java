import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.event.PrintEvent;

public class Testing {
    private String name;
    private String mail;
    private static int  idd = 0;
    private int id;
    private double price;
    private Set<String> list = new TreeSet<>(Comparator.comparing(String::length) );

    public Testing(String name, String mail, double price,Set<String> list){
        this(name,mail,price);
        this.list = list;

    }
    public Testing(String name, String mail, double price){
        this.name = name;
        this.id = idd++;
        this.mail =  mail;
        this.price = price;
    }
    public static void main(String[] args) {
        Set<String> list = new TreeSet<>(Comparator.comparing(String::length) );
        list.add("zf");
        list.add("bfd");
        list.add("cfsdf");
        list.add("dssdsdsdfsdfsdf");
        list.add("esdfsdf");
        list.add("asdfsdfsd");
        list.add("zf");
        list.add("bfd");
        list.add("cfsdf");
        list.add("dssdsdsdfsdfsdf");
        list.add("esdfsdf");
        list.add("asdfsdfsd");
        list.add("zf");
        list.add("bfd");
        list.add("cfsdf");
        list.add("dssdsdsdfsdfsdf");
        list.add("esdfsdf");
        list.add("asdfsdfsd");
        list.forEach(s->System.out.println(s));
        List<Testing> tests = new ArrayList<Testing>();
        tests.add(new Testing("batata1","nduedn#ed",45.0));
        tests.add(new Testing("batata2","nduergdn#ed",45.0));
        tests.add(new Testing("batata3","nduegrgtdn#ed",45.0));
        tests.add(new Testing("batata4","nduedgrn#ed",45.0));
        tests.add(new Testing("batata5","nduedngrrtg#ed",45.0));
        tests.add(new Testing("batata6","nduegrdn#ed",45.0));
        tests.add(new Testing("batata7","nduedgrtn#ed",45.0));
        tests.add(new Testing("batata8","nduedtrgn#ed",45.0));
        for (Testing t:tests){
            System.out.println(t);
        }
        tests.forEach(t -> System.out.println(t.name));
        List<String> resultList = list.stream().filter(s->s.length()<7).collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }












    @Override
    public String toString() {
        return "Name: "+name+", id: "+id+", mail: "+mail+", price: "+price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Testing))
            return false;

        final Testing other = (Testing) obj;
       
        if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }

        return true;
    }
    @Override
    public int hashCode() {

        final int PRIME = 31;
        int hash =   7*PRIME;

        hash = hash * PRIME  + (id^id>>>32);
        hash = hash * PRIME + (int) price ^ (int)((int) price>>32);
        hash = hash * PRIME + this.name==null? 0:this.name.hashCode();

        return hash;

    }
   
}
