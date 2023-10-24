public class Customer {
    private int arrivalTime, departueTime;

    public Customer(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.departueTime = arrivalTime;
    }

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public int getDepartureTime() {
        return this.departueTime;
    }

    public void setDepartureTime(int departueTime) {
        this.departueTime = departueTime;
    }

    public int totalTime() {
        return this.departueTime - this.arrivalTime;
    }

    public String toString(){
        return Integer.toString(arrivalTime);
    }

}
