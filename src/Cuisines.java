public class Cuisines {
    String name;
    int quantity;
    double price;

    public Cuisines(){
        this.name = "Nill";
        this.quantity = 0;
        this.price = 0;
    }
    public Cuisines(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Quantity is: " + quantity);
        System.out.println("Price is: " + price);
    }
}
