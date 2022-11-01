package variables;

public class StringConcatenation {
    public static void main(String[] args) {
        // when we add two string than we say we are doing String Concatenation
        String name="Sonu";
        String last_name="Kumar";
        System.out.println(name+" "+last_name);

        // Now we will use concat() method for add two Strings
        String post ="Software Engineer 1st";
        String company=" AllState India Pvt. Lmt.";
        System.out.println(post.concat(company));

        // add two integer
        int a=100;
        int b=450;
        int sum=a+b;
        System.out.println(sum);
    }
}
