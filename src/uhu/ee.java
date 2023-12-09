package uhu;


import java.util.*;
import java.util.stream.Collectors;


public class ee {
    public static void main(String[] args) {
        Collection<String> meow = new ArrayList<>();
        String s = "sds sd sda f erg y jt ew fdwe fre hytu jkt uyhe f qewd weg yt u erf weqd ewryt h ew d dx ascq wdxadea da d awdadwaweadadawd asdawda dw asxd aw dasdawdwa";
        String[] ss = s.split("\s");
        for (String is:ss) meow.add(is);
        List<String> meowho=meow.stream().map(m->"hoo "+m+" hoo").collect(Collectors.toList());
        meowho.stream().forEach(System.out::println);
        // example with Map & Reduce
        List<Integer> costBeforeTax= Arrays.asList(100, 200, 300, 400, 500);
        double bill = costBeforeTax.stream()
                                            .map(cost -> (cost*2))
                                            .reduce(-3000,(sum, cost) -> sum + cost);
        System.out.println("Total : " + bill);
        
        
    }
}
