package aula5;

public class Publicacao1 {
    private String titulo;
    private String autor;
    private  int id;
    private static int newId=0;
    
    public Publicacao1(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.id=newId++;
    }
    
    public String getAutor() {
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getId(){
        return id;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

}
