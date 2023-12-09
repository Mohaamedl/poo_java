package aula4;
public class ComplexNum {
    int r,i;
    public ComplexNum(int r,int i){
        this.r=r;
        this.i=i;
    }
    public String getNumComplex(){
        String R ="";
        if (i<0) R = r+""+i+"i";
        else R = r+"+"+i+"i";
        return R;
    }
    public static void main(String[] args) {//testar
        int r =1,i=-1;
        ComplexNum c = new ComplexNum(r,i);
        System.out.println(c.getNumComplex());
    }
    
    
}
