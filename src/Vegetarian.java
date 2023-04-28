public class Vegetarian extends Pakistani{
    double caloriesCount;
    public Vegetarian(){
        this.caloriesCount = 0.0;
    }
    public Vegetarian(String name, int quantity, double price,String spiceLevel,double caloriesCount){
        super(name, quantity, price,spiceLevel);
        this.caloriesCount = caloriesCount;
    }
    void display(){
        super.display();
        System.out.println("Calories count is : "+this.caloriesCount);
    }
}
