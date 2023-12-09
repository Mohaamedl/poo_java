package aula7;

public class Exemplo {
    int temp;
    protected static int inic=5;
    //private int MIN=10;
    double PI = Math.PI;
    public Exemplo(int temp){
        this.temp=temp;
        
    }
    public final int  getTemp(){
        return this.temp;
    }
    // adicionalmente..
    // defina uma variável estática inteira com valor inicial 5
    // defina a constante MIN, interna à classe, com valor 10
    // defina a constante PI de modo a que possa ser usada fora da classe na forma Exemplo.PI
    // escreva o método getTemp() de forma a que não possa ser redefinido em classes derivadas 
}
