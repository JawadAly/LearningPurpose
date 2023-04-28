public class Main {
    public static void main(String[] args) {
//        WeightedItem watermelon = new WeightedItem("Watermelon",90,2.5);
//        System.out.println(watermelon.toString());
//        CountedItem blackMarker = new CountedItem("BlackMarker",25,12);
//        System.out.println(blackMarker.toString());

//        BBQ malaiBoti = new BBQ("Malai Boti",6,120,"Beaf");
//        malaiBoti.display();
//        System.out.println("--------------------");
//        Chinese pasta = new Chinese("Pasta",1,300,"Seasoned hot sauce");
//        pasta.display();
//        System.out.println("--------------------");
//        Vegetarian vegSoup = new Vegetarian("Vegetable Soup",1,450,"Medium",628);
//        vegSoup.display();
//        System.out.println("--------------------");
//        Fastfood fireBird = new Fastfood("Fire Bird",1,550,"Zinger Burger");
//        fireBird.display();

//        Student s1 = new Student();
//        s1.setStudentId(2);
//        s1.setStudentName("Jawad Saleem");
//        System.out.println(s1.getStudentId());
//        System.out.println(s1.getStudentName());
//        System.out.println(Student.getUniversityName());

        RegularCustomer c1 = new RegularCustomer();
        c1.customerId = 1;
        c1.customerName = "M Ibrahim";
        c1.customerEmail = "ibrahim@gmail.com";
        c1.timePeriodYrs = 1;
        c1.display();
        System.out.println("---------------------");
        LoyalCustomer c2 = new LoyalCustomer();
        c2.customerId = 2;
        c2.customerName = "Muhammad Ali";
        c2.customerEmail = "ali@gmail.com";
        c2.loyalityPoints = 150;
        c2.loyalityTimePeriod = 5;
        c2.display();
    }
}