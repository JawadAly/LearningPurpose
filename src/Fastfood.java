public class Fastfood extends Cuisines{
    String type;
    public Fastfood(){
        this.type = "Nill";
    }
    public Fastfood(String name, int quantity, double price,String type){
        super(name,quantity,price);
        this.type = type;
    }
    void display(){
        super.display();
        System.out.println("Fast food type is : "+this.type);
    }
}
