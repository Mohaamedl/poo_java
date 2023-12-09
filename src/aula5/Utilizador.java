package aula5;

public class Utilizador {
    private int[] limiteLivros=new int[3];
    private String nome;
    private int nMec;
    private String curso;
    public Utilizador(String nome, int nMec,String curso){
        this.nome=nome;
        this.nMec=nMec;
        this.curso=curso;
    }
    public int[] getLimiteLivros() {
        return limiteLivros;
    }
    public void setLimiteLivros(int[] limiteLivros) {
        this.limiteLivros = limiteLivros;
    }
    public String getCurso() {
        return curso;
    }
    public String getNome() {
        return nome;
    }
    public int getnMec() {
        return nMec;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setnMec(int nMec) {
        this.nMec = nMec;
    }
    public void remove(){
        this.nome=null;
        this.nMec=0;
        this.curso=null;
    }
    public String toString(){
        return String.format("Aluno: %d; %s; %s",nMec,nome,curso);
    }
    
    
}
