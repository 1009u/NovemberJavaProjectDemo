package interfaceDemo;
//Note : we will override all method in our class when we will extend interface(HomeAddress)
public abstract class Sonu implements HomeAddress {

    public static void main(String[] args) {
      Sonu sonu= new Sonu() {
          @Override
          public void flat() {
              System.out.println("777");
          }

          @Override
          public void apartment() {
              System.out.println("Bheema");
          }

          @Override
          public void row() {
              System.out.println("C");
          }

          @Override
          public void nearest_place() {
              System.out.println("Ambedkar Chauk");
          }

          @Override
          public void area() {
              System.out.println("Rama Bai Nagar");
          }

          @Override
          public void city() {
              System.out.println("Pune");
          }

          @Override
          public void district() {
              System.out.println("Pune");
          }

          @Override
          public void state() {
              System.out.println("Maharashtra");
          }

          @Override
          public void pincode() {
              System.out.println("021118");
          }
      };
      sonu.flat();
      sonu.row();
      sonu.apartment();
      sonu.area();
      sonu.nearest_place();
      sonu.city();
      sonu.state();
      sonu.pincode();
    }
}
