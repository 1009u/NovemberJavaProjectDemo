package abstraction;

public abstract class Elephant extends Animal {

    public static void main(String[] args) {
        Elephant elephant=new Elephant() {
            @Override
            public void run() {
                System.out.println("Elephant can not run with the speed of 60 km/hour. ");
            }
        };
        elephant.watch();
        elephant.run();
    }
}
