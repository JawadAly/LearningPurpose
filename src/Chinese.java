public class Chinese extends Cuisines{
    String sauceType;
    public Chinese(){
        this.sauceType = "Nill";
    }
    public Chinese(String name, int quantity, double price,String sauceType){
        super(name,quantity,price);
        this.sauceType = sauceType;
    }
    void display(){
        super.display();
        System.out.println("Sauce type is : "+this.sauceType);
    }
}
