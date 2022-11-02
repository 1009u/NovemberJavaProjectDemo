package ifandelse;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //Instead of writing many if/else statements, you can use the switch statement.
        //The switch statement selects one of many code blocks to be executed.
        //Syntax: switch(expression) { case x:
        // code block
        //    break;
        //  case y:
        // code block
        //  break;
        //  default:
        // code block }
        // Week Days
        int day= 10;
        switch (day){
            case 1:
            System.out.println("Today is Monday.");
            break;

            case 2:
                System.out.println("Today is Tuesday.");
                break;

            case 3:
                System.out.println("Today is Wednesday.");
                break;

            case 4:
                System.out.println("Today is Thursday.");
                break;

            case 5:
                System.out.println("Today is Friday.");
                break;

            case 6:
                System.out.println("Today is Saturday.");
                break;

            case 7:
                System.out.println("Today is Sunday.");
                break;

            default:
                System.out.println("Please Select Day from the Week.");
        }
    }
}
