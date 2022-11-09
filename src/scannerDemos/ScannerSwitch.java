package scannerDemos;

import java.util.Scanner;

public class ScannerSwitch {
    public static void main(String[] args) {
        //user define calculator with switch & break
        System.out.println("::::::::::Welcome in Switch Calculator:::::::::");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Value of A :-");
        int a= sc.nextInt();

        System.out.println("Please Enter Value of B :-");
        int b=sc.nextInt();

        System.out.println(">:::::::Press 1 for Add, 2 for Sub , 3 for Multiply , 4 for Divide::::::>");
        int choice=sc.nextInt();

        switch (choice){
            case 1 :
            System.out.println("Addition of A and B "+(a+b));
            break;

            case 2:
                System.out.println("Subtraction of A and B"+(a-b));
                break;

            case 3:
                System.out.println("Multiply of A and B :"+(a*b));
                break;

            case 4:
                System.out.println("Divide of A and B :"+(a/b));
                break;
            default:
                System.out.println("Invalid Request Please put require as System.");
        }
    }
}
