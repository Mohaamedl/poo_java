package aula3;
import java.util.Random;
/*Altere o programa do exercício 1 de modo que seja possível processar todos os alunos 
de uma turma que tem 16 alunos. Crie um vetor bidimensional para armazenar as notas de 
componentes teórica e prática de todos os alunos e preenche-o com valores aleatórios 
(mas válidos, i.e. as notas podem variar de 0.0 a 20.0). De seguida processe as notas e 
imprima os resultados em formato seguinte:*/
public class ex8 {
    public static void main(String[] args) {
        double[][] notas = new double[16][3];
        Random rand = new Random();
        for (int i = 0; i < 16; i++) { // regrar as notas
            for (int j = 0; j < 2; j++) {
                notas[i][j] = rand.nextDouble(0, 20);
                if (j==2){
                    notas[i][2]=notas[i][0]*0.4 + notas[i][1]*0.6;
                }

            }
        }
        System.out.println("Notas\nTeorica    Pratica     Final");
        for (int i = 0; i<16;i++){
            if  (notas[i][0]<7.0 || notas[i][1]<7.0){
                notas[i][2]=66;
            }

            else {
                notas[i][2]=notas[i][0]*0.4 + notas[i][1]*0.6;   
            }
             System.out.printf("%7.1f   %8.1f   %7.0f\n",notas[i][0],notas[i][1],notas[i][2]);
        }

    

    }
}
