package learning;

public class fortest {
    public static void main(String[] args) {
        int i1, i2;
        double i3;
        for (int n = 1; n <= 100; n++) {
            i1 = n;
            i2 = n * n;
            i3 = Math.pow(2, n);
            System.out.format("%-5d %-5d %-1.1e \n", i1, i2, i3);
        }

    }
}
