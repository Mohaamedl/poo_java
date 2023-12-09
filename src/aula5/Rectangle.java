package aula5;

public class Rectangle {
    double l1,l2;
    public Rectangle(double l1,double l2){
        if(l1>0&&l2>0&&(l1<l2||l1>l2)){
        this.l1=l1;
        this.l2=l2;
        }
        else
            System.out.println("incorrect parameteres!!");
    }
    public double getl2() {
        return l2;
    }
    public double getLen() {
        return l1;
    }
    public void setl2(double l2) {
        this.l2 = l2;
    }
    public void setLen(double l1) {
        this.l1 = l1;
    }
    public double area(){
        return l1*l2;
    }
    @Override
    public String toString() {
        
        return String.format("A Rectangle : lenght=%.2f  l2=%.2f  area=%.2f ",l1,l2,area());
    }
    public boolean equals(Rectangle rect) {
        if (this ==rect)return true;
        
        if (rect==null)return false;
        
        if (getClass() != rect.getClass())return false;
        
        Rectangle other = (Rectangle) rect;
        if (l1!=other.l1 ||l2!=other.l2) return false;
       
        return true;
    }
    

}
