import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter{
    private final static int PROCESS_TIME = 120;
    private final static int NUM_CUSTOMERS = 100;
    private static final int ARRIVAL_INTERVAL = 15; 
    private final static int MAX_CASHIERS = 10;

    public static void main(String[] args){
        int startTime, departureTime, totalTime, avgTime;
        Customer customer;
        QueueADT<Customer> customerQueue = new CircularArrayQueue<Customer>(); // Line of customers
        int[] cashierTime = new int[MAX_CASHIERS]; 

        for (int cashiers = 1; cashiers <= MAX_CASHIERS; cashiers++){
            // load the customer queue with each customer arriving 15 seconds after their predecessor
            for(int count = 1; count <= NUM_CUSTOMERS; count++) {
                    customerQueue.enqueue(new Customer(count * ARRIVAL_INTERVAL));
                } 

                // Init total customer wait time
                totalTime = 0;

                // start of cashier's last customer time
                for (int i = 0; i < cashiers; i++) {
                    cashierTime[i] = 0;
                }

                // single cashier processing all the customers in the queue

                while (!customerQueue.isEmpty()){
                    for (int i = 0; i < cashiers; i++) {
                        if (!customerQueue.isEmpty()) { // checks if code
                            customer = customerQueue.dequeue();
                            // how long the customer waitied in line and how long it took to buy the tickets
                            if(customer.getArrivalTime() > cashierTime[i]){
                                //0 waiting in line... start time is your arrival time
                                startTime = customer.getArrivalTime();
                            }else{
                                // waiting in line... start time is going to be the departure time for the previous
                                startTime = cashierTime[i];
                            }
                            // Customer leaves cashier two minutes later
                            departureTime = startTime + PROCESS_TIME;
                            customer.setDepartureTime(departureTime);
                            // Bump the cashier time to now reflect this last departure time
                            cashierTime[i] = departureTime;
                            // add this customer's wait time to the total
                            totalTime += customer.totalTime();
                        }


                }

            }

            avgTime = totalTime / NUM_CUSTOMERS;
            System.out.println("\n Number of cashiers: " + cashiers);
            System.out.println("Average time: " + avgTime/60 + " minutes, " + avgTime%60 + " seconds (" + avgTime + ") \n \n" );
        }

    }
}