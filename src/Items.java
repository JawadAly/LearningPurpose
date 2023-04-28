public class Items {
    private String name;
    private double unitPrice;
    public Items(){
        this.name = "no item";
        this.unitPrice = 0.0;
    }
    public Items(String name,double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return unitPrice;
    }
    public void setPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String toString(){
        return this.name+" @ "+this.unitPrice;
    }


}
