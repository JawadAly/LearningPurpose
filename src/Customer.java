public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerEmail;
    protected Customer(){
        this.customerId = 0;
        this.customerName = "Nill";
        this.customerEmail = "Nill";
    }
    protected Customer(int custId,String custName,String custEmail){
        this.customerId = custId;
        this.customerName = custName;
        this.customerEmail = custEmail;
    }
    protected void display(){
        System.out.println("Customer Id is : "+this.customerId);
        System.out.println("Customer Name is : "+this.customerName);
        System.out.println("Customer Email is : "+this.customerEmail);
    }

}
