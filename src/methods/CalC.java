package methods;
// we are creating Maths method here
public class CalC {
    //add method
    public void Addition(){
        int a =45;
        int b=85;
        int sum=a+b;
        System.out.println(sum);
    }
    // sub method
   public  void Subtract(){
        int a=85;
       int b=58;
       int sub=a-b;
    System.out.println(sub);
 }


    public static void main(String[] args) {
        CalC obj=new CalC();
        obj.Addition();
        obj.Subtract();

    }
}
