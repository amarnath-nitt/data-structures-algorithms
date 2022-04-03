package main.java.oops.polymorphism;
/*
 * @author amarnath-nitt on 03-04-2022;
 */
public class CreditPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("This is credit payment.");
    }
}
