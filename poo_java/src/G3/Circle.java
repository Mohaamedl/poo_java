package G3;


public class Circle {
    double radius;
    public Circle(double radius){
        if (radius>0)this.radius = radius;
        else System.out.println("Error!");

    }
    @Override
    public String toString() {
        return "Circle: radius - " + this.getRadius();
    }
    //getter 
    public double getRadius() {
        return radius;
    }
    //setter
    public void setRadius(double radius) {
        if (radius>0) this.radius = radius;
    }
       
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Circle))
            return false;

        final Circle other = (Circle) obj;
       
        if (this.radius != other.radius) {
            return false;
        }

        return true;
        
    }
    @Override
    public int hashCode() {
        int hash = 7;
        final int prime = 31;
        hash = prime * hash + (int) this.radius;
        return hash;
    }
    public static void main(String[] args) {
        Circle c2 = new Circle(3);
        Circle c1 = new Circle(3);
        System.out.println(c1.equals(c2));
        System.out.println();
    }


}
