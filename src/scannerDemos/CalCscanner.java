package scannerDemos;

import java.util.Scanner;

// Note : we use scanner class for user define input
public final class CalCscanner {
    //add method & used static for call classname.methodname
    public  static int addition(int a,int b){
        return a+b;
    }

    //sub
    public static int subtract(int a, int b){
        return a-b;
    }

    //multi
    public static int multiply(int a, int b){
        return a*b;
    }

    // divide
    public static int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int choice;
        System.out.println(":::::::::::::::::::::::::::::::Welcome in Multi Calculator::::::::::::::::::::::::::::");
        Scanner scanner=new Scanner(System.in);
        System.out.println("::Please Enter 1 for Addition , 2 for Subtraction , 3 for Multiple and 4 for Divide ::");
        choice=scanner.nextInt();
        System.out.println("<=Please Enter Value A and B =>");
        a= scanner.nextInt();
        b= scanner.nextInt();


        if (choice==1){
            int Sum=CalCscanner.addition(a,b);
            System.out.println("Addition Result is :"+Sum);
        }

        if (choice==2){
            int Sub=CalCscanner.subtract(a,b);
            System.out.println("Subtract Result is :"+Sub);
        }

        if (choice==3){
            int Multi=CalCscanner.multiply(a,b);
            System.out.println("Multiply Result is :"+Multi);
        }

        if (choice==4){
            int Div=CalCscanner.divide(a,b);
            System.out.println("Divide Result is :"+Div);
        }

    }
}
