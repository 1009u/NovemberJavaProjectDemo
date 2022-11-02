package loops;

public class DoWhile1 {
    public static void main(String[] args) {
        // syntax : do {code} while (condition)
        int number = 0;
        do {
            System.out.println("Hello do while.."+number);
            number++;
        }
        while (number<10);

        // second example
        int a =10;
        do {
            System.out.println("Decrement in Do While Loop."+a);
            a--;
        }
        while(a>0);
    }
}



