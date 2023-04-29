public class Flight {
    public int flightNo;
    public String source;
    public String destination;
    private int seatsAvailable;
    public Flight(int flightNo,String source,String destination,int seatsAvailable){
        this.flightNo = flightNo;
        this.source = stringModifier(source);
        this.destination = stringModifier(destination);
        this.seatsAvailable = seatsAvailable;
    }
    public Flight(int flightNo,int seatsAvailable){
        this.flightNo = flightNo;
        this.seatsAvailable = seatsAvailable;
        this.source = "";
        this.destination = "";
    }
    public Flight(int flightNo){
        this.flightNo = flightNo;
        this.seatsAvailable = 0;
        this.source = "";
        this.destination = "";
    }
    public void reserveSeats(int seats){
        if(seats == 0){
            System.out.println("Null seats cannot be reserved please give a valid number.");
        }
        else if(seats <= this.seatsAvailable){
            this.seatsAvailable -= seats;
            System.out.println("Your "+seats+" seats are successfully reserved on Flight No. "+this.flightNo);
        }
        else{
            System.out.println("Sorry ! "+seats+" seats are not available on Flight No. "+this.flightNo);
        }
    }
    public void cancelSeats(int seats){
        this.seatsAvailable += seats;
        System.out.println("Your "+seats+" seats are successfully cancelled for Flight No. "+this.flightNo);

    }
    public void showFlightInfo(){
        System.out.println("Flight No. :"+this.flightNo);
        System.out.println("Source :"+this.source);
        System.out.println("Destination :"+this.destination);
    }
    private String stringModifier(String str){
        if(str.length() <= 3){
            return str.toUpperCase();
        }
        else{
            return str.substring(0,3).toUpperCase();
        }
    }
    public int getSeatsAvailable() {
        return seatsAvailable;
    }
    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }
}
