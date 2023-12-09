package aula6;

public class Setn {
    private int[] n;

    public Setn(){
        this.n=new int[1];
    }
    public void insert(int l){
        if(n[n.length-1]!=0 && !contains(l)){
            int[] n2= new int[size()+1];
            for (int i=0;i<n.length;i++){
                n2[i]=n[i];
            }
            n=n2;
        }
        for (int i=0;i<n.length;i++){
            if(n[i]==0) {n[i]=l; break;}
        }
    }
    public int size() {
        return n.length;
    }
    public void remove(int k){
        if(contains(k)){
            int l=findIndex(k);
            int[] n2= new int[n.length-1];
            for(int i = 0;i<n2.length;i++){
                if(i<l){ n2[i]=n[i];}
                else { n2[i]=n[i+1];}
            }
            n=n2;
        }
    }
    public boolean contains(int l){
        boolean r=false;
        for (int i:n) {
            if(l==i){
                r= true;
                break;
            }
        }
        return r;
    }
    public void empty(){
        for (int i=0;i<n.length;i++){
            n[i]=0;
        }
        // ou int [] n = new int[1]; this.n=n;
    }
    public String toString(){
        System.out.print("{");
        for (int i =0;i<n.length-1;i++){
            System.out.print(n[i]+",");
        }
        System.out.print(n[n.length-1]);
        System.out.print("}");
        return "";
    }
    public Setn union(Setn n2){
        Setn n4 = new Setn();
        for(int i = 0;i<n.length;i++){
            n4.insert(n[i]);
        }
        for(int i=0;i<n2.n.length;i++){
            n4.insert(n2.n[i]);
        }
        return n4;
    }
    public Setn inter(Setn ni){
        Setn n3= new Setn();
        for (int l:n){
            if(ni.contains(l)){
                n3.insert(l);
            }
        }
        return n3;
    }
    public int findIndex(int k){
        int index=0;
        for (int i= 0;i<n.length;i++){
            if(n[i]==k){
               index=i;
            }
        }
        return index;

    }
    public Setn sub(Setn n2){
        Setn n3 = new Setn();
        for (int i = 0;i<n.length;i++){
            if(i<n2.n.length){
                n3.insert(n[i]-(n2.n[i]));
            }
            else  {n3.insert(n[i]);}     
        }
        return n3;
    }

}