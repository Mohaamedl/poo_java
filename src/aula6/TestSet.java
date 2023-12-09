package aula6;

public class TestSet {
    public static void main(String[] args) {
        Setn c1 = new Setn();
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5); c1.insert(0); c1.insert(-323);
        Setn c2 = new Setn();
        int[] test = {7, 3, 2, 5, 4, 6, 7}; 
        for (int el : test) { c2.insert(el);}
        System.out.println(c1);
        System.out.println(c2);
        c2.remove(3); c2.remove(5); c2.remove(6);c2.remove(9); c1.remove(0);c1.remove(-323);c1.remove(1112);
        System.out.println("\n");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Número de elementos em c1: " + c1.size());
        System.out.println("Número de elementos em c2: " + c2.size());
        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
        System.out.println("c2 contém 6?:" + ((c2.contains(6) ? "sim" : "não")));
        System.out.printf("União: %s\n",c1.union(c2)); 
        System.out.printf("Interseção: %s\n" , c1.inter(c2));//{4,7}
        System.out.printf("Diferença: %s\n" ,c1.sub(c2));
        c1.empty();
        System.out.printf("c1: %s\n" , c1);
    }
    

    
}
