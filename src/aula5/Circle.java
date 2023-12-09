package aula5;

public class Circle {
    private double radius;
    public Circle(int radius){
        if (radius >0){
        this.radius=radius;
        }
        else 
            System.out.println("incorrect radius!");
    }
    public double getradius(){
        return radius;
    }
    void setradius(int radius){
        if (radius>0)
            this.radius=radius;
        else 
            this.radius=0;
    }
    
    public double area(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return String.format("A circl: radius = %.2f  area = %.2f",radius,area());
    }
    public boolean equals(Circle c) {
        if (this == c)
        return true;
        if (c == null)
        return false;
        if (getClass() != c.getClass())
        return false;
        Circle other = (Circle) c;
        if (radius != other.radius)
        return false;
        return true;
    }
    
}
