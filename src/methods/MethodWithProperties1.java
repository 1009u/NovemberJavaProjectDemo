package methods;

public class MethodWithProperties1 {
    // we will create here student method
    public void student(){
        String name="Yogesh";
        int age=47;
        int roll_no=13;
        String branch="CS";
        System.out.println(name+" "+age+" "+roll_no+" "+branch);
    }

    // phone with properties
    protected void phone(){
        String brand="Samsung";
        int price =45850;
        String release_date= "14.November.2022";
        System.out.println(brand+" "+price+" "+release_date);

    }
    public static void main(String[] args) {
        MethodWithProperties1 obj=new MethodWithProperties1();
        obj.student();
        obj.phone();
    }
}

