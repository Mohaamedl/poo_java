package aula9;
import java.util.*;
public class CollectionnTester {
    public static void main(String[] args) {
        int DIM = 50000;
        Collection<Integer> col1 = new ArrayList<>();
        Collection<Integer> col2 = new LinkedList<>();
        Collection<Integer> col3 = new HashSet<>();
        Collection<Integer> col4 = new TreeSet<>();
        
        System.out.println("Colections|Arraylist:  add | search | remove |LinkedList:  add |  search | remove | HashSet:  add | search | remove | Treeset:   add | search | remove ||");
        for (int i =10000;i<=DIM;i+=10000){
            double[] l1 = checkPerformance(col1, i),l2= checkPerformance(col2, i),l3 =checkPerformance(col3, i),l4= checkPerformance(col4, i);
            
            System.out.printf(" %d:%19.2f |%7.2f |%7.2f |%16.2f |%8.2f |%7.2f |%14.2f |%7.2f |%7.2f |%15.2f |%7.2f |%7.2f ||\n",
            i,
            l1[0],l1[1],l1[2],
            l2[0],l2[1],l2[2],                                     
            l3[0],l3[1],l2[2],
            l4[0],l4[1],l4[2]);
        }
        
       
        
    }
    







    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop;
        double[] delta = new double[3];
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta[0] = (stop-start)/1e6; // convert to milliseconds
        
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta[1] = (stop-start)/1e6; // convert nanoseconds to milliseconds
        
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta[2] = (stop-start)/1e6; // convert nanoseconds to milliseconds
        return delta;

    }
}