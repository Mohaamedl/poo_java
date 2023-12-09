package aula5;
import java.util.Scanner;
public class FiguresTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle[] circles = new Circle[10];
        Rectangle[] rectangles = new Rectangle[10];
        Triangle[] triangles = new Triangle[10];
        System.out.println("Figures operations\n1-create a new circle\n2-create a new triangle\n3-create a new rectangle");
        System.out.println("4-see all figures\n0-exit.");
        int n = input.nextInt(),i=0,j=0,k=0;
        while(n!=0){
            switch (n) {
                case 1 :{
                    if(i<10) {
                        circles[i]= new Circle(input.nextInt());
                        i++;
                    }
                }
                break;
                case 2 : {
                    if (j<10){
                        triangles[j]= new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
                        j++;
                    }
                }

                break;
                case 3 :{
                    if (k<10){
                        rectangles[k] = new Rectangle(input.nextDouble(),input.nextDouble());
                        k++;
                    }
                }

                break;
                case 4 : {
                    for (int u =0; u<circles.length;u++){
                        if (circles[u] != null)
                            System.out.println(circles[u]);
                        }
                    for (int u =0; u<triangles.length;u++){
                        if (triangles[u] != null)
                            System.out.println(triangles[u].toString());
                        }
                    for (int u =0; u<rectangles.length;u++){
                        if (rectangles[u] != null )
                            System.out.println(rectangles[u].toString());
                        }
                    
                }
                break;
                
            }
            System.out.println("Figures operations\n1-create a new circle\n2-create a new triangle\n3-create a new rectangle");
            System.out.println("4-see all figures\n0-exit.");
            n = input.nextInt();
        }
        input.close();
        

    } 

    
    
}
