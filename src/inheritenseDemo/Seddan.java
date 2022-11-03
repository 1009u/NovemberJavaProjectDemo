package inheritenseDemo;

public class Seddan extends XUV{
    public void Sed_price(){
        System.out.println("The price of New Seddan is Start 28 Lac to 50 Lac.");
    }
    public static void main(String[] args) {
        Seddan car=new Seddan();
        car.brand();
        car.price();
        car.Sed_price();


    }
}
