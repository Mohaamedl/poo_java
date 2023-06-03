package G3;



public class Triangle {
    double sideA,sideB,sideC;
    public Triangle(double sideA,double sideB, double sideC){
        if (validTriangle(sideA,sideB,sideC)){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        else{
            System.out.println("error!");
        }
        
    }
    
    public String toString() {
        return this.sideA !=0.0 ? String.format("Triangle: side A - %.2f, side B - %.2f, side C - %.2f", this.sideA,this.sideB,this.sideC):"Wrong parameters for a triangle!";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Triangle))
            return false;

        final Triangle other = (Triangle) obj;
       
        if (this.sideA != other.sideA ||this.sideB != other.sideB || this.sideC != other.sideC) {
            return false;
        }
        return true;
        
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode() * prime +7;
        hash = hash*prime + (int) (this.getSideA());
        hash = hash*prime + (int) (this.getSideB());
        hash = hash*prime + (int) (this.getSideC());
        return hash;
    }

    // getters
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    private static boolean validTriangle(double a, double b, double c){
        return a<b+c && b<a+c && c<a+b? true:false;
    }
    public static void main(String[] args) {
        Triangle teste = new Triangle(3,4,5);
        System.out.println(teste);
    }
}
