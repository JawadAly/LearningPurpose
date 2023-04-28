public class WeightedItem extends Items{
    private double weight;
    public WeightedItem(){
        this.weight = 0.0;
    }
    public WeightedItem(String name,double unitPrice,double weight){
        super(name,unitPrice);
        this.weight = weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice(){
        return super.getPrice() * this.weight;
    }
    public String toString(){
        return super.toString()+" "+this.weight+"Kg  "+this.getPrice();
    }

}
