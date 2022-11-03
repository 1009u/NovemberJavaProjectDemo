package array;

public class ArrayString1 {
    public static void main(String[] args) {
        // without for loop

        String [] word= {"S","O","N","U"};
        System.out.println(word[0]);
        System.out.println(word[1]);
        System.out.println(word[2]);
        System.out.println(word[3]);

        //for loop
        String [] brand= {"Nokia","Samsung","Vivo","Lava"};
        for (int i=0; i<brand.length; i++ ){
            System.out.println(brand[i]);
        }

        // for each loop or Advance for loop
        //Syntax : for (DataType variable_name : array_name){sop(variable_name)};

        String [] city={"Agra","Goa","Pune","Punjab"};
        for (String city_name:city){
            System.out.println(city_name);
        }
    }
}
