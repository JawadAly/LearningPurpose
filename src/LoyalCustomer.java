public class LoyalCustomer extends Customer {
    protected int loyalityPoints;
    protected int loyalityTimePeriod;
    protected LoyalCustomer(){
        this.loyalityPoints = 0;
        this.loyalityTimePeriod = 0;
    }
    protected LoyalCustomer(int custId,String custName,String custEmail,int loyalityPoints,int loyalityTimePeriod){
        super(custId,custName,custEmail);
        this.loyalityPoints = loyalityPoints;
        this.loyalityTimePeriod = loyalityTimePeriod;
    }
    protected void display(){
        super.display();
        System.out.println("Customer loyality points are : "+this.loyalityPoints);
        System.out.println("Customer loyality time period is : "+this.loyalityTimePeriod);
    }
}
