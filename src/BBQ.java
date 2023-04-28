public class BBQ extends Cuisines{
    String meatType;
    public BBQ(){
     this.meatType = "Nill";
    }
    public BBQ(String name, int quantity, double price, String meatType) {
        super(name, quantity, price);
        this.meatType = meatType;
    }
    public void display() {
        super.display();
        System.out.println("Meat Type: " + meatType);
    }

}
