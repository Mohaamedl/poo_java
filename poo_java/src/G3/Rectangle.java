package G3;

public class Rectangle {
    double sideA,sideB;
    public Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public String toString() {
        
        return String.format("Rectangle: side a - %.2f, side b - %.2f",this.sideA,this.sideB);
    }
    // getters
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    // setters
    public void setSideA(double sideA) {
        if (this.sideA!=this.sideB) this.sideA = sideA;
        
    }
    public void setSideB(double sideB) {
        if (this.sideA!=this.sideB) this.sideB = sideB;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Rectangle))
            return false;

        final Rectangle other = (Rectangle) obj;
       
        if (this.sideA != other.sideA) {
            return false;
        }
        if (this.sideB != other.sideB) {
            return false;
        }

        return true;
        
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode()*prime + 7;
        hash = prime * hash + (int) this.getSideA();
        hash = prime * hash + (int) this.getSideB();
        return hash;
    }
    
}
