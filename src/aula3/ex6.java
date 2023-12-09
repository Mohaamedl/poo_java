package aula3;
import  java.util.Scanner;
//Escreva um programa que lê do teclado uma data composta pelo mês e o ano (validando-os), 
//calcule e escreva no monitor o número de dias desse mês. Nota: não se esqueça dos anos bissextos.
public class ex6 {
    public static void main(String[] args) {
        int month,year,days;
        Scanner input = new Scanner(System.in);
        int [] monthdaysBis = {0,31,29,31,30,31,30,31,31,30,31,30,31} ;
        System.out.println("month:");
        month = input.nextInt();
        System.out.println("year:");
        year =  input.nextInt();
        while (month > 12 || month <= 0 || year < 0){
            System.out.println("ERROR! \n month:");
            month =  input.nextInt();
            System.out.println("year:");
            year = input.nextInt();
            
        }
        input.close();

        if(leapYear(year)){
            days = monthdaysBis[month];
        }
        else if (!leapYear(year) && (month == 02 || month == 1)) {
            days = 28;
        }
        else 
            days = monthdaysBis[month];
        System.out.printf("O mes escolhido no ano %d tem %d dias" ,year,days);
        
        
        








    }
    public static Boolean leapYear(int y){
            if (y %4==0 && y%100!=0 || y%4 == 0 && y%400==0 && y%100==0)
                return true;
            else
                return false;    
    }


        



    
}
