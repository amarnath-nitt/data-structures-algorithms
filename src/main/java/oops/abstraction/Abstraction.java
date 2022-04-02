package main.java.oops.abstraction;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class Abstraction {
    public static void main(String []args){
        Contractor contractor = new Contractor("Amarnath", 1000L, 8L);
        System.out.println("Total monthly payment of contractor: " +  contractor.getPaymentPerMonth());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Amarnath", 900L, 9L);
        System.out.println("Total monthly payment of full time employee: " +  fullTimeEmployee.getPaymentPerMonth());
    }
}

