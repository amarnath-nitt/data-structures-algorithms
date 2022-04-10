package main.java.oops.staticKeyword.examples.counterTicket;

public class Ticket {
    int ticketId;
    String ticketHolderName;
    static String movieName = "BAHUBALI";

    public Ticket(String ticketHolderName){
        Counter counter = new Counter();
        this.ticketHolderName = ticketHolderName;
        this.ticketId = counter.getCounterCount();
    }

    public void display(){
        System.out.println(ticketId + " , " + ticketHolderName + " , " + movieName);
    }
}
