package models;

public class Speaker {
    String brand;
    int product_id;
    int price;
    String made_in;

    public Speaker(String brand, int product_id, int price, String made_in) {
        this.brand = brand;
        this.product_id = product_id;
        this.price = price;
        this.made_in = made_in;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMade_in() {
        return made_in;
    }

    public void setMade_in(String made_in) {
        this.made_in = made_in;
    }


}
