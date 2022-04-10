package main.java.oops.staticKeyword.examples.counterTicket;

public class CounterMain {
    public static void main(String []args){
        Ticket t1 = new Ticket("Amarnath");
        Ticket t2 = new Ticket("Ajay Kumar");
        Ticket t3 = new Ticket("Amit Kumar");

        t1.display();
        t2.display();
        t3.display();
    }
}
