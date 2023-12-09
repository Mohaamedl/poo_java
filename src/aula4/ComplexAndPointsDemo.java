package aula4;

import java.util.Arrays;

public class ComplexAndPointsDemo {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(-1,-2), c2 = new ComplexNum(3,4);
        Point3D p1 = new Point3D(5,6,7), p2 = new Point3D(9,10,11);
        Point3D[] ref10Point3D = new Point3D[10];
        System.out.printf("c1:%s\nc2:%s\np1:%s\np2:%s",c1.getNumComplex(),c2.getNumComplex(),p1.getCoordPoint(),p2.getCoordPoint());
        Arrays.toString(ref10Point3D);
   }

}
    

