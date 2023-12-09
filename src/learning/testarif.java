package learning;
public class testarif {
    public static void main(String[] args) {
        int t = 189, s = 0, i = 0, l = 0;
        if (t > 50)
            System.out.println("oh");
        else if (t >= 25)
            System.out.println("ooh");
        else if (t >= 12)
            System.out.println("oooh");
        else
            System.out.println("oooooh");
        
        
        do {
            i += t * 34;
            s += Math.pow(t, 2);
            --t;
            l += t * t - 2 * t + 5;
        } while (t > 0);
        System.out.format("valores de saida: %2d , %2d e %2d ", s, i,l);


    }

}
