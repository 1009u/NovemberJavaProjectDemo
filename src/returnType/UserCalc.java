package returnType;

import java.util.Scanner;

public class UserCalc {
    int Addition(int a, int b){
    return a+b;
    }

    int Subtract(int a, int b){
        return a-b;
    }

    int Multiply(int a, int b){
        return a*b;
    }

    int Divide (int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome in Calculator :");

        System.out.println("Type 1 for add, 2 for sub, 3 for multiply , 4 for divide :");
        int choice =sc.nextInt();
        System.out.println("Put Value A and B :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        UserCalc obj= new UserCalc();

        if (choice==1){
          int Add =obj.Addition(a,b);
            System.out.println("Addition of A and B :"+Add);
        }
        if (choice==2){
            int Sub =obj.Subtract(a,b);
            System.out.println("Subtract of A and B :"+Sub);
        }
        if (choice==3){
            int Mul =obj.Multiply(a,b);
            System.out.println("Multiply of A and B :"+Mul);
        }
        if (choice==4){
            int Div =obj.Divide(a,b);
            System.out.println("Addition of A and B :"+Div);
        }





    }
}
