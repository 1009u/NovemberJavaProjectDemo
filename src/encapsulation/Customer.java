package encapsulation;

//Definition : By the encapsulation we can bind data and data member
// in to single unit. or By the encapsulation we can
//secure our data in to single unit for it we have to create our data
// member private and for access we will provide getter() and setter() method.

public class Customer {
    //information of customer
    private String name;
    private int age;
    private int user_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
