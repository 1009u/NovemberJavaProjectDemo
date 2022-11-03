package polimorphism;

public class MethodOverloading1 {
    void users(String full_name){
        System.out.println("User's Name is :"+full_name);
    }

    void users(int age){
        System.out.println("User's age is :"+age);
    }

    public static void main(String[] args) {
        MethodOverloading1 obj=new MethodOverloading1();
        obj.users("Sonu Kumar");
        obj.users(30);


    }
}
