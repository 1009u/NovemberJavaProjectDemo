package polimorphism;
// Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
public class MethodOverridingA {
     public void greet(){
         System.out.println("Good Morning.");
     }

     public void hello(){
         System.out.println("Have a nice day.");
     }

    public static void main(String[] args) {
    MethodOverridingA respect=new MethodOverridingA();
        respect.greet();
        respect.hello();
    }
}
