package aula5;

public class Livro {
    private  int id;
    private static int newId=100;
    private String titulo;
    private String tipoEmprestimo;
    private String disponivel;
    
    public Livro(String titulo,String tipoEmprestimo){
        this(titulo);
        this.tipoEmprestimo=tipoEmprestimo;
    }
    public Livro(String titulo){
        this.titulo=titulo;
        this.id=newId++;
        this.disponivel="sim";
    }

    public String getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }
    
    




    public int getId() {
        return id;
    }
    
    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }
    public String toString(){
        return String.format("Livro %d; %s; %s",id,titulo,tipoEmprestimo);
    }

    
}
