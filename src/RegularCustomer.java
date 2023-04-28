public class RegularCustomer extends Customer{
    protected int timePeriodYrs;
    protected RegularCustomer(){
        this.timePeriodYrs = 0;
    }
    protected RegularCustomer(int custId,String custName,String custEmail,int timePeriodYrs){
        super(custId,custName,custEmail);
        this.timePeriodYrs = timePeriodYrs;
    }
    protected void display(){
        super.display();
        System.out.println("Customer time period is : "+this.timePeriodYrs);
    }
}
