package polimorphism;

public class MethodOverloading2 {
    public int add(int a, int b){
        return a+b;
    }
    // method overloading now
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading2 obj=new MethodOverloading2();
        int Add1=obj.add(45,96);
        System.out.println("Addition A and B : "+Add1);

       int Add2= obj.add(85,26,78);
        System.out.println("Addition A,B and C : "+Add2);
    }
}
