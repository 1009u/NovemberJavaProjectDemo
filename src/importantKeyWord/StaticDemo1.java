package importantKeyWord;
// when we use static keyword we don't need to create main method
public class StaticDemo1 {
    public static void info(){
        System.out.println("I am a good learner.");
    }

    public static void main(String[] args) {
        // we can call our method with classname.methodname();
        StaticDemo1.info();
    }
}
