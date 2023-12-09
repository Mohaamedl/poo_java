package aula8;

import java.util.ArrayList;

public class Empresa {
    protected String nome,codPostal,email;
    ArrayList<Motociclo> motociclos = new ArrayList<>();
    ArrayList<AutoLigeiro> autoLigieros = new ArrayList<>();
    ArrayList<PesadoMerc> pesadosMerc = new ArrayList<>();
    ArrayList<PesadoPassg> pesadoPassgs = new ArrayList<>();
    public Empresa(String nome,String codPostal,String email){
        try {
            if(validCodPostal(codPostal)){
                this.nome=nome;
                this.codPostal=codPostal;
                this.email=email;
            }
        }
        catch(Exception e) {
            System.out.println("Dados invalidos.");
        }

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCodPostal() {
        return codPostal;
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public String toString(){
        return String.format("Nome da empresa: %s\nCodigo postal: %s\nEmail: %s\n",nome,codPostal,email)+ "Veiculos desponiveis:\n"+
        motociclos.toString()+"\n"+autoLigieros.toString()+"\n"+pesadosMerc.toString()+"\n"+pesadoPassgs.toString()+"\n";
    }


    public static boolean validCodPostal(String codPostal){
        if(codPostal.matches("\\d{4,4}-\\d{3,3}") && codPostal.length()==8){
            return true;
        }
        else 
        return false;
    }

}
