package Pradeep;

public class Product {

    private String pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(String pic, double price, int quantity) {
        this.pid = pic;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters (optional)
    public String getPic() {
        return pid;
    }

    public void setPic(String pic) {
        this.pid = pic;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}






