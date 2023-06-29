package G5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Veiculo implements KmPercorridosInterface {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int potencia;

    // contrutor(es)
    public Veiculo(String matricula, String marca, String modelo, int potencia){
        try {
            if(verificaMatricula(matricula) && potencia>0){
                this.matricula = matricula;
                this.marca = marca;
                this.modelo = modelo;
                this.potencia = potencia;

            }
            else{
                throw new Exception("Dados Incorretos");
            }
        } 
       
        catch (Exception e) {
            // if there is any other error during the communication with the database, 
            // throw a generic IOException
            System.out.println(e);
        }
    }
    





    private static boolean verificaMatricula(String matricula){
        Pattern pattern = Pattern.compile("\\d{2}-[A-Z]{2}-\\d{2}");
        Matcher matcher = pattern.matcher(matricula);
        boolean matchFound = matcher.find();

        return matchFound;
    }
    public static void main(String[] args) {
        boolean teste = Veiculo.verificaMatricula("78-KL-98");
        System.out.println(teste);
        
    }
}
