package ifandelse;

public class IfandElse {
    public static void main(String[] args) {
        // String
        //Syntax : if (condition) else {code}
        String city="Agra";
        if (city=="Goa"){
            System.out.println("you are in agra.");
        }
        else {
            System.out.println("you are in other city pleas check your status.");
        }

        //Integer
        int age=58;
        if (age<55){
            System.out.println("You are eligible for old age pension.");
        }
        else {
            System.out.println("You are not eligible for old age pension.");
        }

    }
}
