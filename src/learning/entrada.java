package learning;
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A: ");
        input.useDelimiter("[;\r\n]+");
        String A = input.next();
        System.out.println("B: ");
        String B = input.next();
        System.out.println("C: ");
        String C = input.next();
        System.out.println("----------");
        System.out.format("|%-40.7s|\n|%-40s|\n|%-40s|",A,B,C );
        input.close();
        

    }
}
