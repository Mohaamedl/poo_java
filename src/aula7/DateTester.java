package aula7;

import java.util.Scanner;
public class DateTester {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
        int n;
        do{
            while(!input.hasNextInt()){
              System.out.println("A int number please.");
              System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
              input.next();
            }
            n=input.nextInt();
            if(n>4||n<0) {
                System.out.println("A number between 0 and 4 please.");
                System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
            }
        }
        while(n<0||n>4);
        DateYMD date = new DateYMD();
        while(n!=0){
            switch (n){
                case 1 :{
                DateYMD date1 = new DateYMD(input.nextInt(),input.nextInt(),input.nextInt());
                date = date1;
                System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
                n=input.nextInt();
                }
                break;
                case 2 : {System.out.println("Actual date:"+date.toString());
                    System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
                    n=input.nextInt();}
                break;
                case 3 : {date.increment(date, input.nextInt(),input.nextInt(),input.nextInt());
                    System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
                    n=input.nextInt();}
                break;
                case 4 : {date.decrement(date,input.nextInt(),input.nextInt(),input.nextInt());
                    System.out.println("DateYMD operations:\n1 -create new date\n2 -show current date\n3 -increment date\n4 -decrement date\n0 -exit");
                    n=input.nextInt();}
                break;
            }
        } 
        input.close();
        System.out.println("Fisished!!");
    }
}
