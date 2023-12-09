package aula3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {// filtrar notas, minimo 7 valores cada comp. teorica 0.4 e pratica 0.6
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a nota(de 0 a 20) da componente teorica e da componente pratica:");
        Double nt, np;
        do {
            
            while(!input.hasNextDouble() ){
                System.out.println("nao é um numero!");
                input.next(); 
            }
            nt = input.nextDouble();
            while(!input.hasNextDouble() ){
                System.out.println("nao é um numero!");
                input.next();
            }
            np = input.nextDouble();
            System.out.println("introduza os valores no intervalo: [0,20]");
        }

        while ((np > 20 || np < 0 || nt < 0 || nt > 20));
        System.out.printf("%f   %f",nt,np);

        input.close();

        if (nt < 7.0 || np < 7.0)
            System.out.println("66(reprovado por nota mínima)");
        else {
            double nf = (Math.round(nt * 100d) / 100d) * 0.4 + (Math.round(np * 100d) / 100d) * 0.6;
            System.out.format("A nota final do/a aluno/a é %.0f", nf);
        }

    }

}
