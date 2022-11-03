package returnType;

public class Calculator {
    // addition
    int addition(int a, int b){
        return a+b;
    }

    //subtract
    int subtract(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int  add=calculator.addition(45,96);
        System.out.println("Addition of A and B :"+add);

        int sub=calculator.subtract(754,658);
        System.out.println("Subtract of A and B :");
    }
}
