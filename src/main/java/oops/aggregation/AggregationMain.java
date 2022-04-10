package main.java.oops.aggregation;

public class AggregationMain {
    public static void main(String []args){
        Address address1 = new Address("Ambedkar Nagar", "Uttar Pradesh", "India", 22429L);
        Address address2 = new Address("Ambedkar Nagar", "Uttar Pradesh", "India", 22430L);

        Employee employee1 = new Employee(1, "Amarnath", address1);
        Employee employee2 = new Employee(2, "Raju", address2);

        employee1.display();
        employee2.display();
    }
}
