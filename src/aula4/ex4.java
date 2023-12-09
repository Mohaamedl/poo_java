package aula4;

/*
Escreva um programa que lê do teclado uma data composta pelo mês, pelo ano, 
e ainda pelo dia da semana em que começa esse mês (1 = Segunda, 2 = Terça, 3 = Quarta, 
4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo) e que desenha no monitor o calendário 
desse mês com o formato que a seguir se apresenta. Implemente a funcionalidade pretendida 
com três funções:leitura de valores, cálculo de dias no mês e impressão de resultados.
*/
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] R = new int[3];
        int month, year, day;
        // coletar dados
        R = ColectsData();
        long startTime = System.nanoTime();
        month = R[0];
        year = R[1];
        day = R[2];
        PrintData(month, year, day, DaysMonth(year, month));
        long endTime = System.nanoTime(), totalTime = endTime - startTime;
        System.out.println("\nfinished in " + totalTime + " nano seconds");
    }





    // --------------------------------------------------------------------------------------------------------------
    public static int DaysMonth(int year, int month) {
        int daysMonth;
        int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (leapYear(year) && month == 2)
            daysMonth = 29;
        else
            daysMonth = monthDays[month];
        return daysMonth;
    }

    public static String PrintData(int month, int year, int day, int daysMonth) {
        int[] days = { 7, 1, 2, 3, 4, 5, 6 };
        String s = "";
        String[] months = { "", "January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November", "December" };
        System.out.println("---------CALENDAR---------");
        System.out.printf("      %s %d", months[month], year);
        System.out.print("\nSu  Mo  Tu  We  Th  Fr  Sa");
        for (int i = 0; i < 6; i++) { // first spaces
            if (day != days[i])
                s += "    ";
            else
                break;
        }
        if (day==7) System.out.print(s);
        else System.out.print("\n"+s);
        for (int i = 1; i <= daysMonth; i++) {
            if (day == 7) {
                System.out.println();
                day = 0;
            }
            System.out.printf("%2d  ", i);
            day++;
        }
        return "finished";
    }
    //----------------------------------------------------------------------------------------------------------------
    public static Boolean leapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 4 == 0 && y % 400 == 0 && y % 100 == 0)
            return true;
        else
            return false;
    }
    //-----------------------------------------------------------------------------------------------------------------
    public static int[] ColectsData() {
        int day, month, year;
        Scanner input = new Scanner(System.in);
        int[] r = new int[3];

        do {
            System.out.println("Introduce:\nmonth:");
            while (!input.hasNextInt()) {
                System.out.println("a int number please.");
                input.next();
            }
            month = input.nextInt();
            if (month > 12 || month < 0) {
                System.out.println("month is between 1 and 12.");
            }
        } while (month > 12 || month < 0);
        do {
            System.out.println("year:");
            while (!input.hasNextInt()) {
                System.out.println("a int number please.");
                input.next();
            }
            year = input.nextInt();
            if (year < 0) {
                System.out.println("year is over 0.");
    
            }
        } while (year < 0);
        do {
            System.out.println("the first day of the month (1=Monday,2=Tuesday,3=Wednesday,4=Thursday,5=Friday,6=Saturday,7=Sunday):");
            while (!input.hasNextInt()) {
                System.out.println("a int number please.");
                input.next();
            }
            day = input.nextInt();
            if (day < 0 || day > 7) {
                System.out.println("day is between 1 and 7.");
            
            }
        } while (day < 0 || day > 7);
        input.close();
        r[0] = month;
        r[1] = year;
        r[2] = day;
        return r;
    }

}