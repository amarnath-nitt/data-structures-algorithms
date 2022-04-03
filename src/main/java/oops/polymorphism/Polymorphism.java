package main.java.oops.polymorphism;
/*
 * @author amarnath-nitt on 03-04-2022;
 */
public class Polymorphism {
    public static void main(String []args){
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay();
        CreditPayment creditPayment = new CreditPayment();
        creditPayment.pay();

        Payment p = new CashPayment();
        p.pay();
        p = new CreditPayment();
        p.pay();
    }
}
