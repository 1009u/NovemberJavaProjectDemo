package variables;

public class VariableDemo1 {
    public static void main(String[] args) {
        //In Java, there are different types of variables, for example:
        //String - stores text, such as "Hello". String values are surrounded by double quotes
        //int - stores integers (whole numbers), without decimals, such as 123 or -123
        //float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        //char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        //boolean - stores values with two states: true or false
        String name="Taj Mahal";
        System.out.println("The best indian Historical Place :"+name);

        int year=1648;
        System.out.println("Taj make year :"+year);

        float area= 10000.45f;
        System.out.println("Average are of Taj : "+area);

        //Note when we use char on than time we will not use double cote
        char word_of_Taj='T';
        System.out.println("Taj Mahal Start word with :"+word_of_Taj);

        boolean color=true;
        System.out.println("Color of Taj is White :"+color);



    }
}
