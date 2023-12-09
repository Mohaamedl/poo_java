package aula4;
public class Point3D {
    int x,y,z;
    public Point3D(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public String getCoordPoint(){
        return String.format("(%d,%d,%d)",x,y,z);

    }
    public static void main(String[] args) {//testar
        Point3D p1 = new Point3D(1,2,3);
        System.out.println(p1.getCoordPoint());
    }

}
