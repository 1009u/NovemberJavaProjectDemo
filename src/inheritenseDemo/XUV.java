package inheritenseDemo;

public class XUV {
    public void brand(){
        String name="Toyota";
        System.out.println(name);
    }

    public void price(){
        System.out.println("Price of Toyota is starts from 12 lac to 17 lac");
    }

    public static void main(String[] args) {
        XUV vehicle=new XUV();
        vehicle.brand();
        vehicle.price();
    }
}
