package problem1;

public class Item {
    private String name ;
    private double price ;
    private int quantity ;


    Item(String name , double price , int quantity) {
        this.name =  name ;
        this.price  =  price ;
        this.quantity  =  quantity ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String toString() {
        return "Item { " + this.name + "\n"
                + " price " + this.price + "\n"
                + " quantity " + this.quantity + "\n" ;
    }

}
