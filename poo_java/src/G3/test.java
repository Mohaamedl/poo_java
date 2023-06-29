package G3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Rectangle> rectangles = new HashSet<>();
        Set<Circle> circles = new HashSet<>();
        Set<Triangle> triangles = new HashSet<>();
        int option;
        do{ 
            System.out.println("Menu------------\nCriar circulo - 1\nCriar retangulo - 2\nCriar triangulo - 3 \nVer tudo - 4\nSair - 0\n");
            option = sc.nextInt();
            switch (option){
                case 1:{
                    System.out.println("raio:");
                    double r = sc.nextDouble();
                    circles.add(new Circle(r));
                    break;
                }
                case 2:{
                    System.out.println("Comprimento:");
                    double sideA = sc.nextDouble();
                    System.out.println("Largura:");
                    double sideB = sc.nextDouble();
                    rectangles.add(new Rectangle(sideA,sideB));
                    break;
                }
                case 3:{
                    System.out.println("Lado A:");
                    double sideA = sc.nextDouble();
                    System.out.println("Lado B:");
                    double sideB = sc.nextDouble();
                    System.out.println("Lado C:");
                    double sideC = sc.nextDouble();
                    triangles.add(new Triangle(sideA,sideB,sideC));
                    break;
                }
                case 4:{
                    for (Circle c:circles){
                        System.out.println(c);
                    }
                    for (Rectangle r:rectangles){
                        System.out.println(r);
                    }
                    for (Triangle t:triangles){
                        System.out.println(t);
                    }
                    System.out.println("0 para ver menu");
                    sc.nextDouble();
                    break;
                }
                

            }

        }while(option!=0);
        sc.close();
    
    }

}
