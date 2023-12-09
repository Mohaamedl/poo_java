package aula5;
public class Triangle {
    double l1,l2,l3;
    public Triangle(double l1,double l2,double l3){
        try { 
            if(l1>0&&l2>0&&l3>0 &&  Math.abs(l1+l3)<=(Math.abs(l1)+Math.abs(l3))){
            this.l1=l1;
            this.l2=l2;
            this.l3=l3;
            }
        }
        catch(Exception e){ System.out.println("incorrect parameters");}
        
           
    
        
    }
    double getL1() {
        return l1;
    }
    double getL2() {
        return l2;
    }
    double getL3() {
        return l3;
    }
    public void setL1(double l1) {
        this.l1 = l1;
    }
    public void setL2(double l2) {
        this.l2 = l2;
    }
    public void setL3(double l3) {
        this.l3 = l3;
    }
    @Override
    public String toString() {
        return String.format("A Triangle with sides : %.2f  %.2f  %.2f and area=%.2f", l1,l2,l3,area());
    }
    public double area(){
        double p=(l1+l2+l3)/2;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }
    public boolean equals(Triangle tri) {
        if (this ==tri)
        return true;
        if (tri==null)
        return false;
        if (getClass() != tri.getClass())
        return false;
        Triangle other = (Triangle) tri;
        if (l1!=other.l1 ||l2!=other.l2||l3!=other.l3)
        return false;
        return true;
    }
    

    

}
