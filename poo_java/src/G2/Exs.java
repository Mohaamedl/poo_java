package G2;


public class Exs {
    public static void main(String[] args) {
        double x = mile(1);
        System.out.printf("frfrde%f\n",x);
        System.out.println(tax(5000,1));
        System.out.println(energy(23,40,23));
    }

    public static double mile(double km){
        return km / 1.609;
    }
    public static double faR(double c){
        return 1.8 * c + 32;
    }
    public static double tax(double mon,double tx){
        int n = 3;
        return (double) Math.round((mon *  Math.pow((1 + tx/(100)),n))*1000)/1000;
    }
    public static double energy(double  m, double finalTemperature,double initialTemperature){
        double q = m * (finalTemperature - initialTemperature) * 4184;
        return q;
    }
    


}
