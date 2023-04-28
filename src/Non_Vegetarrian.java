public class Non_Vegetarrian extends Pakistani{
    double caloriesCount;
    String meatType;
    public Non_Vegetarrian(){
        this.caloriesCount = 0.0;
        this.meatType = "Nill";
    }
    public Non_Vegetarrian(String name, int quantity, double price,String spiceLevel,double caloriesCount,String meatType){
        super(name, quantity, price,spiceLevel);
        this.caloriesCount = caloriesCount;
        this.meatType = meatType;
    }
    void display(){
        super.display();
        System.out.println("Calories count is : "+this.caloriesCount);
        System.out.println("Meat type is : "+this.meatType);
    }
}
