public class CountedItem extends Items{
    private int quantity;
    public CountedItem(){
        this.quantity = 0;
    }
    public CountedItem(String name,double unitPrice,int quantity){
        super(name,unitPrice);
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice(){
        return super.getPrice() * this.quantity;
    }
    public String toString(){
        return super.toString()+" "+this.quantity+"units  "+this.getPrice();
    }
}
