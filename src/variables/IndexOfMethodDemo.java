package variables;

public class IndexOfMethodDemo {
    public static void main(String[] args) {
        String story="As the name suggests, String Pool in java is a pool of " +
                "Strings stored in Java Heap Memory. We know that String is a " +
                "special class in java and we can create String objects using a new" +
                " operator as well as providing values in double-quotes.";
        System.out.println(story.indexOf("name"));
    }
}
