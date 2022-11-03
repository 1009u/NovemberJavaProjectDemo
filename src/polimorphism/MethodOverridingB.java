package polimorphism;

public class MethodOverridingB extends MethodOverridingA{
    public void bye(){
        System.out.println("See you again take care your self .");
    }
    public static void main(String[] args) {
        MethodOverridingB respect=new MethodOverridingB();
        respect.greet();
        respect.hello();
        respect.bye();


    }
}
