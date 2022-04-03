package main.java.oops.polymorphism;
/*
 * @author amarnath-nitt on 03-04-2022;
 */
public class CashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("This is cash payment.");
    }
}
