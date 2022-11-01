package numberDataType;

public class NumberDataTypeDemo1 {
    public static void main(String[] args) {
        //Note : There are two type of Primitive Data Type
        // 1. Integer Data: byte, short , int , long
        //2. Floating Data : float and double

        // we will apply first Integer Data Type
        // byte
        // Note : it will take value till -128 to +127
        byte num1 = -128;
        System.out.println(num1);

        byte num2= 127;
        System.out.println(num2);

        //short
        //Note : The short data type can store whole numbers from -32768 to 32767
        short num3= -32768;
        System.out.println(num3);

        short num4=32766;
        System.out.println(num4);

        //int
        // Note: The int data type can store whole numbers from -2147483648 to 2147483647.
        int distance= 2045845687;
        System.out.println("Distance in KM :"+distance);

        int back_distance=-185456431;
        System.out.println("Back Distance in KM :"+back_distance);

        //long
        //Note:The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        long count=8534583415668385645l;
        System.out.println(count);

        long count_forward=-7896345486983985364l;
        System.out.println(count_forward);


        // Floating Data Type
        // Note : The float and double data types can store fractional numbers,
        // that you should end the value with an "f" for floats and "d" for doubles.
        //You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        float area=245524546454646354655467465463324654.13455f;
        System.out.println(area);

        double area_double=45558865454848787846458527638424852478245426487779642875496426998447889568.9999999565d;
        System.out.println("Double :"+area_double);

    }
}
