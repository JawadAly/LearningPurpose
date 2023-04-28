public class Beverages extends Cuisines{
    String flavour;
    String iceLevel;
    public Beverages(){
        this.flavour = "Nill";
        this.iceLevel = "Nill";
    }
    public Beverages(String name, int quantity, double price,String flavour,String iceLevel){
        super(name,quantity,price);
        this.flavour = flavour;
        this.iceLevel = iceLevel;
    }
    void display(){
        super.display();
        System.out.println("Beverage flavour is : "+this.flavour);
        System.out.println("Ice level is : "+this.iceLevel);
    }
}
