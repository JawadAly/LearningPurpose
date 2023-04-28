public class Pakistani extends Cuisines{
    String spiceLevel;
    public Pakistani(){
        this.spiceLevel = "Nill";
    }
    public Pakistani(String name, int quantity, double price, String spiceLevel) {
        super(name, quantity, price);
        this.spiceLevel = spiceLevel;
    }
    void display() {
        super.display();
        System.out.println("Spice Level: " + spiceLevel);
    }
}
