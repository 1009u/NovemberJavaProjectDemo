package abstraction;
//By the abstraction we can hide some details and we will show some essential things to user.
// in abstract class we will create at least one abstract method
public abstract class Animal {
    public abstract void run();  // abstract method

    public void watch()  // non-abstract method
    {
        System.out.println("It can see in the night");
    }
    public static void main(String[] args) {
        Animal obj= new Animal() {
            @Override
            public void run() {
                System.out.println("Tiger can run with the speed of 50 km/h .");
            }
        };
        obj.watch();
        obj.run();

    }
}
