package aula5;

/*Date operations:
1 -create new calendar
2 -print calendar month
3 -print calendar
0 –exit
*/
import java.util.Scanner;

public class CalendarTester {
    public static void main(String[] args) {
        Date d = new Date(123, 232, 32313);// verificar se da erro
        System.out.println(d.toString());
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Date operations:\n1 -create new calendar\n2 -print calendar month\n3 -print calendar\n0 –exit");
        byte n = input.nextByte();
        Calendar call = new Calendar(0, 0);
        while (n != 0) {
            switch (n) {
                case 1: {
                    int day = input.nextInt();
                    int year = input.nextInt();
                    Calendar cal = new Calendar(day, year);
                    call = cal;
                    System.out.println(
                            "\nDate operations:\n1 -create new calendar\n2 -print calendar month\n3 -print calendar\n0 –exit");
                    n = input.nextByte();
                }
                    break;
                case 2: {
                    call.printMonth(input.nextInt());
                    System.out.println(
                            "\nDate operations:\n1 -create new calendar\n2 -print calendar month\n3 -print calendar\n0 –exit");
                    n = input.nextByte();
                }
                    break;
                case 3: {
                    call.toString();
                    System.out.println(
                            "\nDate operations:\n1 -create new calendar\n2 -print calendar month\n3 -print calendar\n0 –exit");
                    n = input.nextByte();
                }
                    break;

            }
        }
        input.close();
    }

}
